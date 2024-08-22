package com.riccahang.banking.service;

import com.riccahang.banking.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto account);
    AccountDto getAccountById(Long id);
}
