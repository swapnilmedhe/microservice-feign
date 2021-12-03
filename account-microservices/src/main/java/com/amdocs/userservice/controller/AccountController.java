package com.amdocs.userservice.controller;

import com.amdocs.userservice.model.Account;
import com.amdocs.userservice.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@Slf4j
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(path = "/save")
    public Account save(@RequestBody Account accout){
        log.info("inside user controller ");
        return accountService.saveAccout(accout);
    }

    @GetMapping(path="/{id}")
    public Account getAccountById(@PathVariable Long  id){
        log.info("inside user controller ");
        return accountService.findByAccountId(id);
    }

    @GetMapping(path="/all")
    public List<Account> getAllAccounts(){
        System.out.println("inside controller========================");
        return accountService.getAllAccouts();
    }

    @DeleteMapping (path="/{id}")
    public void getAccount(@PathVariable Long id){
        System.out.println("deleting User of Id"+id);
        if(accountService.findByAccountId(id)!=null)
        {
            accountService.deleteAccout(id);
        }else {
            log.error("User with id :"+id+"not present");
        }
    }

}
