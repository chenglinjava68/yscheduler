package com.yeahmobi.yscheduler.model.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeahmobi.yscheduler.common.Constants;
import com.yeahmobi.yscheduler.common.Paginator;
import com.yeahmobi.yscheduler.model.Attempt;
import com.yeahmobi.yscheduler.model.AttemptExample;
import com.yeahmobi.yscheduler.model.dao.AttemptDao;
import com.yeahmobi.yscheduler.model.service.AttemptService;
import com.yeahmobi.yscheduler.model.type.AttemptStatus;

@Service
public class AttemptServiceImpl implements AttemptService {

    @Autowired
    private AttemptDao attemptDao;

    public Attempt get(long id) {
        return this.attemptDao.selectByPrimaryKey(id);
    }

    public List<Attempt> list(long instanceId, int pageNum, Paginator paginator) {
        AttemptExample example = new AttemptExample();

        example.createCriteria().andInstanceIdEqualTo(instanceId);

        int count = this.attemptDao.countByExample(example);

        paginator.setItemsPerPage(Constants.PAGE_SIZE);
        paginator.setItems(count);
        paginator.setPage(pageNum);

        int offset = paginator.getBeginIndex() - 1;
        int limit = Constants.PAGE_SIZE;

        RowBounds rowBounds = new RowBounds(offset, limit);
        example.setOrderByClause("create_time DESC");

        return this.attemptDao.selectByExampleWithBLOBsWithRowbounds(example, rowBounds);
    }

    //
    // public List<Attempt> listAll(long instanceId) {
    // AttemptExample example = new AttemptExample();
    //
    // example.createCriteria().andInstanceIdEqualTo(instanceId);
    // example.setOrderByClause("create_time DESC");
    //
    // return this.attemptDao.selectByExampleWithBLOBs(example);
    // }

    public void save(Attempt attempt) {
        attempt.setCreateTime(new Date());
        this.attemptDao.insertSelective(attempt);
    }

    public Attempt getLastOne(long instanceId) {
        AttemptExample example = new AttemptExample();

        example.createCriteria().andInstanceIdEqualTo(instanceId).andActiveEqualTo(true);
        example.setOrderByClause("id DESC");

        RowBounds rowBounds = new RowBounds(0, 1);

        List<Attempt> list = this.attemptDao.selectByExampleWithBLOBsWithRowbounds(example, rowBounds);

        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public List<Attempt> getAllUncompleteds() {
        AttemptExample example = new AttemptExample();
        example.createCriteria().andStatusEqualTo(AttemptStatus.RUNNING).andActiveEqualTo(true);

        return this.attemptDao.selectByExampleWithBLOBs(example);
    }

    public int countActive(Long instanceId) {
        AttemptExample example = new AttemptExample();
        example.createCriteria().andInstanceIdEqualTo(instanceId).andActiveEqualTo(true);

        return this.attemptDao.countByExample(example);
    }

    public void update(Attempt attempt) {
        attempt.setUpdateTime(new Date());
        this.attemptDao.updateByPrimaryKeySelective(attempt);
    }

    public String getOutputFileName(Attempt attempt) {
        return String.valueOf(attempt.getId()) + ".log";
    }

    public void archiveExistsAttempts(long instanceId) {
        AttemptExample example = new AttemptExample();
        example.createCriteria().andInstanceIdEqualTo(instanceId);

        Attempt record = new Attempt();
        record.setUpdateTime(new Date());
        record.setActive(false);
        this.attemptDao.updateByExampleSelective(record, example);
    }

}
