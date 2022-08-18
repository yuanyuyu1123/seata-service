package com.rs.service.impl;

import cn.hutool.core.util.IdUtil;
import com.rs.client.ProductClient;
import com.rs.entity.Account;
import com.rs.entity.Product;
import com.rs.mapper.AccountMapper;
import com.rs.service.IAccountService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
* @author yuan
*/
@Service
public class AccountServiceImpl implements IAccountService {

    private final static Logger log = LoggerFactory.getLogger(IAccountService.class);

    private final AccountMapper accountMapper;

    private final ProductClient productClient;

    @Autowired
    public AccountServiceImpl(AccountMapper accountMapper, ProductClient productClient) {
        this.accountMapper = accountMapper;
        this.productClient = productClient;
    }

    @Override
    @Transactional
    @GlobalTransactional
    public int insertAccount(Account record) {
        //Product product = new Product(IdUtil.getSnowflakeNextId(), 2, 3, 5, new Date());
        Product product = new Product(null, 2, 3, 5, new Date());
        log.debug("produce:{}",product);
        productClient.insertProduct(product);
        record.setId(IdUtil.getSnowflakeNextId());
        return accountMapper.insertAccount(record);
    }
}
