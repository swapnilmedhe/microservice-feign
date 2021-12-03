package com.amdocs.userservice.service;

import com.amdocs.userservice.model.Account;
import com.amdocs.userservice.repo.AccountRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AccountService {

    @Autowired
    private AccountRepo accountRepo;

    public Account saveAccout(Account account) {
        log.info("account added"+account);
        return accountRepo.save(account);
    }

    public Account findByAccountId(Long id) {
        log.info("fetching user by id: "+id);
        return  accountRepo.findByAccoutId(id);
    }

    public List<Account> getAllAccouts() {
        log.info("fetching All user ");
        return  accountRepo.findAll();
    }

    public void deleteAccout(Long id) {
        accountRepo.delete(id);
    }
}
