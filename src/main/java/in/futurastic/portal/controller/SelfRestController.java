package in.futurastic.portal.controller;

import in.futurastic.portal.model.SchoolModel;
import in.futurastic.portal.model.auth.AuthorityModel;
import in.futurastic.portal.model.auth.User;
import in.futurastic.portal.model.profile.StaffProfileModel;
import in.futurastic.portal.model.profile.StudentProfileModel;
import in.futurastic.portal.service.SchoolService;
import in.futurastic.portal.service.auth.AuthorityService;
import in.futurastic.portal.service.auth.UserService;
import in.futurastic.portal.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1/self")
public class SelfRestController {
    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private AuthorityService authorityService;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public List<AuthorityModel> getAuthoritiesUser(){
        return authorityService.getAuthorityBySelf();
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public User getSelf(){
        return userService.getSelf();
    }

    @RequestMapping(value = "/school", method = RequestMethod.GET)
    public SchoolModel getSchoolUser(){
        return schoolService.getSchoolBySelf();
    }
}
