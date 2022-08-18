package com.rs.service;

import com.rs.entity.Account;

/**
* @author 23216
* @description 针对表【account】的数据库操作Service
* @createDate 2022-08-18 18:24:52
*/
public interface IAccountService {
    int insertAccount(Account record);
}
