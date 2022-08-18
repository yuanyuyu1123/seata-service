package com.rs.controller;

import com.rs.entity.Product;
import com.rs.response.AjaxResult;
import com.rs.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuan
 */

@RestController
public class ProductController {
    private final IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/addProduct")
    public AjaxResult insertProduct(@RequestBody Product product){
        return AjaxResult.success(productService.insertProduct(product));
    }
}
