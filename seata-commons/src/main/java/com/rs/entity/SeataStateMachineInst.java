package com.rs.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName seata_state_machine_inst
 */
@Data
public class SeataStateMachineInst implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * state machine definition id
     */
    private String machineId;

    /**
     * tenant id
     */
    private String tenantId;

    /**
     * parent id
     */
    private String parentId;

    /**
     * start time
     */
    private Date gmtStarted;

    /**
     * business key
     */
    private String businessKey;

    /**
     * start parameters
     */
    private String startParams;

    /**
     * end time
     */
    private Date gmtEnd;

    /**
     * end parameters
     */
    private String endParams;

    /**
     * status(SU succeed|FA failed|UN unknown|SK skipped|RU running)
     */
    private String status;

    /**
     * compensation status(SU succeed|FA failed|UN unknown|SK skipped|RU running)
     */
    private String compensationStatus;

    /**
     * is running(0 no|1 yes)
     */
    private Integer isRunning;

    /**
     * 
     */
    private Date gmtUpdated;

    /**
     * exception
     */
    private byte[] excep;

    private static final long serialVersionUID = 1L;
}