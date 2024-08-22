package com.riccahang.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riccahang.banking.entity.Account;;

public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
