package com.NWS.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.NWS.Entity.User;

public interface UserService extends UserDetailsService {
    void save(User user);
}
