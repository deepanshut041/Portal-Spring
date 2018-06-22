package in.futurastic.portal.service.auth;


import in.futurastic.portal.model.auth.AuthorityModel;
import in.futurastic.portal.model.auth.User;
import in.futurastic.portal.repository.auth.AuthorityRepository;
import in.futurastic.portal.repository.auth.UserRepository;
import in.futurastic.portal.service.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
        user.setLastPasswordResetDate(new Date());
        User user1 = userRepository.save(user);
        return user1;
    }
}
