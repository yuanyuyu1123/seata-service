package com.rs.client;

import com.rs.constant.ServiceClientConstant;
import com.rs.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author yuan
 */

@FeignClient(ServiceClientConstant.STORAGE_SERVICE)
public interface ProductClient {
    @PostMapping("/addProduct")
    int insertProduct(@RequestBody Product product);
}
