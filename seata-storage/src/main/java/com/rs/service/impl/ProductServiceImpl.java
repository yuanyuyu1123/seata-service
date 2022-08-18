package com.rs.service.impl;

import com.rs.entity.Product;
import com.rs.mapper.ProductMapper;
import com.rs.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yuan
 */
@Service
public class ProductServiceImpl implements IProductService {

    private ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    /**
     * @param product
     * @return
     */
    @Override
    @Transactional
    public int insertProduct(Product product) {
        return productMapper.insertProduct(product);
    }
}
