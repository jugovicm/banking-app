package com.jugovicm.banking.service.impl;

import com.jugovicm.banking.dto.AccountDto;
import com.jugovicm.banking.entity.Account;
import com.jugovicm.banking.mapper.AccountMapper;
import com.jugovicm.banking.repository.AccountRepository;
import com.jugovicm.banking.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount ( accountDto );
        Account savedAccount = accountRepository.save ( account );
        return AccountMapper.mapToAccountDto ( savedAccount );
    }
}
