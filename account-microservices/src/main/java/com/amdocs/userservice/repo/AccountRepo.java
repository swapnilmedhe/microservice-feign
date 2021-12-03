package com.amdocs.userservice.repo;

import com.amdocs.userservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account,Long> {
    Account findByAccoutId(Long id);
}
