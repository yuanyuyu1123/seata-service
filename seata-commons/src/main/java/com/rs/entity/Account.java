package com.rs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yuan
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {

    /**
     *
     * @TableName account
     */
        /**
         *
         */
        private Long id;

        /**
         *
         */
        private String commodityCode;

        /**
         *
         */
        private Integer count;

        private static final long serialVersionUID = 1L;
}
