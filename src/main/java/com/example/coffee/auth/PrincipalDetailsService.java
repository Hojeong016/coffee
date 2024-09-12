package com.example.coffee.auth;

import com.example.coffee.domain.User;
import com.example.coffee.repository.UserServiceRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PrincipalDetailsService implements UserDetailsService {
    private final UserServiceRepository userServiceRepository;
    private final PasswordEncoder passwordEncoder;

    public PrincipalDetailsService(UserServiceRepository userServiceRepository, PasswordEncoder passwordEncoder) {
        this.userServiceRepository = userServiceRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userServiceRepository.findByAccountId(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        } else {
            return new PrincipalDetails(user);
        }
    }
}
