package com.rs.mapper;

import com.rs.entity.Account;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yuan
*/

@Mapper
public interface AccountMapper{
    int insertAccount(Account record);

}
