package in.futurastic.portal.service;


import in.futurastic.portal.model.auth.AuthorityModel;
import in.futurastic.portal.model.auth.User;
import in.futurastic.portal.repository.AuthorityRepository;
import in.futurastic.portal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public User saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Optional<AuthorityModel> authority = authorityRepository.findById((long) 1);
        if(authority.isPresent()){
            List<AuthorityModel> authorities = new ArrayList<>();
            authorities.add(authority.get());
            user.setAuthorities(authorities);
        }
        User user1 = userRepository.save(user);
        return user1;
    }
}
