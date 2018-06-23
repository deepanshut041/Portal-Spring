package in.futurastic.portal.service.auth;

import in.futurastic.portal.model.auth.AuthorityModel;
import in.futurastic.portal.model.auth.JwtUser;
import in.futurastic.portal.model.auth.User;
import in.futurastic.portal.repository.auth.AuthorityRepository;
import in.futurastic.portal.repository.auth.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    AuthorityRepository authorityRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<AuthorityModel> getAuthorityBySelf() {
        JwtUser jwtUser = (JwtUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Optional<User> user = userRepository.findById(jwtUser.getId());
        if (user.isPresent()) {
            List<User> users = new ArrayList<>();
            users.add(user.get());
             return authorityRepository.findAllByUsers(users);
        }
        return null;
    }

    @Override
    public AuthorityModel addAuthority(AuthorityModel authorityModel) {
        return authorityRepository.save(authorityModel);
    }

    @Override
    public List<AuthorityModel> getAllAuthority() {
        return authorityRepository.findAll();
    }

    @Override
    public List<AuthorityModel> getAuthorityByName(String name) {
        return authorityRepository.findAllByName(name);
    }
}
