package com.riccahang.banking.service.impl;

import org.springframework.stereotype.Service;

import com.riccahang.banking.dto.AccountDto;
import com.riccahang.banking.entity.Account;
import com.riccahang.banking.mapper.AccountMapper;
import com.riccahang.banking.repository.AccountRepository;
import com.riccahang.banking.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exist"));
        return AccountMapper.mapToAccountDto(account);
    }
    
}
