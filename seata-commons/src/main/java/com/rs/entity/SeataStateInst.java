package com.rs.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName seata_state_inst
 */
@Data
public class SeataStateInst implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * state machine instance id
     */
    private String machineInstId;

    /**
     * state name
     */
    private String name;

    /**
     * state type
     */
    private String type;

    /**
     * service name
     */
    private String serviceName;

    /**
     * method name
     */
    private String serviceMethod;

    /**
     * service type
     */
    private String serviceType;

    /**
     * business key
     */
    private String businessKey;

    /**
     * state compensated for
     */
    private String stateIdCompensatedFor;

    /**
     * state retried for
     */
    private String stateIdRetriedFor;

    /**
     * start time
     */
    private Date gmtStarted;

    /**
     * is service for update
     */
    private Integer isForUpdate;

    /**
     * input parameters
     */
    private String inputParams;

    /**
     * output parameters
     */
    private String outputParams;

    /**
     * status(SU succeed|FA failed|UN unknown|SK skipped|RU running)
     */
    private String status;

    /**
     * update time
     */
    private Date gmtUpdated;

    /**
     * end time
     */
    private Date gmtEnd;

    /**
     * exception
     */
    private byte[] excep;

    private static final long serialVersionUID = 1L;
}