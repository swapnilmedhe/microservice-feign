package com.amdocs.userservice.feignutils;

import com.amdocs.userservice.model.Account;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="accountfeign" ,url="http://localhost:9093/account")
public interface FeignUtils {

    @GetMapping(path="/all")
    Account getAccountById(@PathVariable Long  id);
}
