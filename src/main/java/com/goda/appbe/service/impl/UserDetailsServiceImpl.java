package com.goda.appbe.service.impl;

import com.goda.appbe.data.model.User;
import com.goda.appbe.data.repository.UserRepository;
import com.goda.appbe.impl.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).get();

        if (user == null) {
            throw new UsernameNotFoundException("username not found");
        }
        return new UserDetailsImpl(user);
    }
}
