package com.rs.mapper;

import com.rs.entity.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yuan
 */
@Mapper
public interface ProductMapper {

    int insertProduct(Product product);
}
