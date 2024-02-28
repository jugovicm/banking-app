package com.jugovicm.banking.service;

import com.jugovicm.banking.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto account);
    AccountDto getAccountById(Long Id);
}
