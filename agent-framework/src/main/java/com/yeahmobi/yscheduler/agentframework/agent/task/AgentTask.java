package com.yeahmobi.yscheduler.agentframework.agent.task;

import java.util.Map;

/**
 * @author Leo.Liang
 */
public interface AgentTask {

    public TaskExecutor getTaskExecutor();

    public String getEventType();

    public String getTaskName();

    public Map<String, String> getTaskParams();

}
