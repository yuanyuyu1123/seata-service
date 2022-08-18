package com.rs.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName seata_state_machine_def
 */
@Data
public class SeataStateMachineDef implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * name
     */
    private String name;

    /**
     * tenant id
     */
    private String tenantId;

    /**
     * application name
     */
    private String appName;

    /**
     * state language type
     */
    private String type;

    /**
     * comment
     */
    private String comment;

    /**
     * version
     */
    private String ver;

    /**
     * create time
     */
    private Date gmtCreate;

    /**
     * status(AC:active|IN:inactive)
     */
    private String status;

    /**
     * content
     */
    private String content;

    /**
     * transaction recover strategy(compensate|retry)
     */
    private String recoverStrategy;

    private static final long serialVersionUID = 1L;
}