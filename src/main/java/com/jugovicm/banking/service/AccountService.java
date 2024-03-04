package com.jugovicm.banking.service;

import com.jugovicm.banking.dto.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto account);
    AccountDto getAccountById(Long Id);
    AccountDto deposit(Long id, double amount);
    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();
    void deleteAccount(Long id);
}
