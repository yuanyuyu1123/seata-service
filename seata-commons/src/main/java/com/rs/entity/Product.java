package com.rs.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author yuan
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private Integer price;
    private Integer stock;
    private Integer frozen;
    private Date updateTime;
}
