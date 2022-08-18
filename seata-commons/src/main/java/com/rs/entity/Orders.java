package com.rs.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName orders
 */
@Data
public class Orders implements Serializable {
    /**
     * 订单id
     */
    private Long id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 产品id
     */
    private Integer productId;

    /**
     * 购买产品数
     */
    private Integer count;

    /**
     * 订单金额
     */
    private Integer payAmount;

    /**
     * 订单状态：0：创建中;1:已创建;-1:已取消
     */
    private Integer status;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}