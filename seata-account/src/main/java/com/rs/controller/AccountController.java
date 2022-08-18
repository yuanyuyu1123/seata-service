package com.rs.controller;

import com.rs.entity.Account;
import com.rs.response.AjaxResult;
import com.rs.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuan
 */

@RestController
public class AccountController {

    private final IAccountService accountService;

    @Autowired
    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/addAccount")
    public AjaxResult insertAccount(@RequestBody Account account) {
        return AjaxResult.success(accountService.insertAccount(account));
    }
}
