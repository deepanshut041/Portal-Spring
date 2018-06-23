package in.futurastic.portal.service.auth;


import in.futurastic.portal.model.auth.AuthorityModel;
import in.futurastic.portal.model.auth.JwtUser;
import in.futurastic.portal.model.auth.User;
import in.futurastic.portal.repository.auth.AuthorityRepository;
import in.futurastic.portal.repository.auth.UserRepository;
import in.futurastic.portal.service.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
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
        user.setLastPasswordResetDate(new Date());
        User user1 = userRepository.save(user);
        return user1;
    }

    @Override
    public User getSelf() {
        JwtUser jwtUser = (JwtUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Optional<User> user = userRepository.findById(jwtUser.getId());
        if (user.isPresent()) {
            List<User> users = new ArrayList<>();
            return user.get();
        }
        return null;
    }
}
