/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.xbaya.messaging;

import org.apache.airavata.common.utils.ThriftUtils;
import org.apache.airavata.model.messaging.event.ExperimentStatusChangeEvent;
import org.apache.airavata.model.messaging.event.JobIdentifier;
import org.apache.airavata.model.messaging.event.JobStatusChangeEvent;
import org.apache.airavata.model.messaging.event.Message;
import org.apache.airavata.model.messaging.event.MessageLevel;
import org.apache.airavata.model.messaging.event.MessageType;
import org.apache.airavata.model.messaging.event.TaskIdentifier;
import org.apache.airavata.model.messaging.event.TaskStatusChangeEvent;
import org.apache.airavata.model.messaging.event.WorkflowIdentifier;
import org.apache.airavata.model.messaging.event.WorkflowNodeStatusChangeEvent;
import org.apache.thrift.TException;

import java.util.Date;

public class EventData {

    private Message  messageEvent;

    private Date updateDate;

    private String status;
    private String experimentId;
    private String workflowNodeId;

    private String message;
    private MessageLevel messageLevel;
    private String messageId;

    /**
     * Constructs a MonitorEvent.
     * 
     * @param event
     */
    public EventData(Message event) throws TException {
        this.messageEvent = event;
        process(event);
    }

    private void process(Message event) throws TException {
        this.messageId = event.getMessageId();
        this.messageLevel = event.getMessageLevel();
        if (event.getMessageType() == MessageType.EXPERIMENT) {
            ExperimentStatusChangeEvent experimentStatusChangeEvent = new ExperimentStatusChangeEvent();
            ThriftUtils.createThriftFromBytes(event.getEvent(), experimentStatusChangeEvent);
            this.status = experimentStatusChangeEvent.getState().toString();
            this.experimentId = experimentStatusChangeEvent.getExperimentId();
            this.workflowNodeId = "";
            this.message = "Received experiment event , expId : " + experimentStatusChangeEvent.getExperimentId() +
                    ", status : " + experimentStatusChangeEvent.getState().toString();
        }   else if (event.getMessageType() == MessageType.WORKFLOWNODE) {
            WorkflowNodeStatusChangeEvent wfnStatusChangeEvent = new WorkflowNodeStatusChangeEvent();
            ThriftUtils.createThriftFromBytes(event.getEvent(), wfnStatusChangeEvent);
            WorkflowIdentifier wfIdentifier = wfnStatusChangeEvent.getWorkflowNodeIdentity();
            this.status = wfnStatusChangeEvent.getState().toString();
            this.experimentId = wfIdentifier.getExperimentId();
            this.workflowNodeId = wfIdentifier.getWorkflowNodeId();
            this.message = "Received workflow status change event, expId : " +  wfIdentifier.getExperimentId() +
                    ", nodeId : " + wfIdentifier.getWorkflowNodeId() + " , status : " + wfnStatusChangeEvent.getState().toString();

        }else if (event.getMessageType() == MessageType.TASK) {
            TaskStatusChangeEvent taskStatusChangeEvent = new TaskStatusChangeEvent();
            ThriftUtils.createThriftFromBytes(event.getEvent(), taskStatusChangeEvent);
            TaskIdentifier taskIdentifier = taskStatusChangeEvent.getTaskIdentity();
            this.status = taskStatusChangeEvent.getState().toString();
            this.experimentId = taskIdentifier.getExperimentId();
            this.workflowNodeId = taskIdentifier.getWorkflowNodeId();
            this.message = "Received task event , expId : " + taskIdentifier.getExperimentId() + ",taskId : " +
                    taskIdentifier.getTaskId() + ", wfNodeId : " + taskIdentifier.getWorkflowNodeId() + ", status : " +
                    taskStatusChangeEvent.getState().toString();
        } else if (event.getMessageType() == MessageType.JOB) {
            JobStatusChangeEvent jobStatusChangeEvent = new JobStatusChangeEvent();
            ThriftUtils.createThriftFromBytes(event.getEvent(), jobStatusChangeEvent);
            JobIdentifier jobIdentifier = jobStatusChangeEvent.getJobIdentity();
            this.status  = jobStatusChangeEvent.getState().toString();
            this.experimentId = jobIdentifier.getExperimentId();
            this.workflowNodeId = jobIdentifier.getWorkflowNodeId();
            this.message = "Received task event , expId : " + jobIdentifier.getExperimentId() + " ,taskId : " +
                    jobIdentifier.getTaskId() + ", wfNodeId : " + jobIdentifier.getWorkflowNodeId() + ", status : " +
                    jobStatusChangeEvent.getState().toString();
        }
    }

    /**
     * Returns the event.
     * 
     * @return The event
     */
    public Message getEvent() {
        return this.messageEvent;
    }

    /**
     * Returns the type.
     * 
     * @return The type
     */
    public MessageType getType() {
        return this.messageEvent.getMessageType();
    }

	public Date getUpdateTime() {
        if (updateDate == null) {
            updateDate = new Date(this.messageEvent.getUpdatedTime());
        }
        return updateDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public MessageLevel getMessageLevel() {
        return messageLevel;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getExperimentId() {
        return experimentId;
    }

    public String getWorkflowNodeId() {
        return workflowNodeId;
    }
}