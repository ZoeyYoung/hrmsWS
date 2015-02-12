package com.hrms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.hrms.entity.Account;
import com.hrms.repository.AccountRepository;

public class AccountService implements UserDetailsService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        // Inject Repository
        this.accountRepository = accountRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        List<Account> accounts = accountRepository.findByUsername(username);
        if (accounts != null) {
            Account account = accounts.get(0);
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            return new User(account.getUsername(), account.getPassword(), authorities);
        }
        throw new UsernameNotFoundException("User '" + username + "' not fount.");
    }

}
