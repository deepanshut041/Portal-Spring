package in.futurastic.portal.controller;

import in.futurastic.portal.model.SchoolModel;
import in.futurastic.portal.model.auth.AuthorityModel;
import in.futurastic.portal.service.SchoolService;
import in.futurastic.portal.service.auth.AuthorityService;
import in.futurastic.portal.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @Qualifier("jwtUserDetailsService")
    private UserDetailsService userDetailsService;

//    @RequestMapping(value = "/profile/student", method = RequestMethod.GET)
//    public JwtUser getProfileStudentUser(HttpServletRequest request) {
//        String token = request.getHeader(tokenHeader).substring(7);
//        String username = jwtTokenUtil.getUsernameFromToken(token);
//        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
//        return user;
//    }

//    @RequestMapping(value = "/menu", method = RequestMethod.GET)
//    public JwtUser getMenuAuthenticatedUser(HttpServletRequest request) {
//        String token = request.getHeader(tokenHeader).substring(7);
//        String username = jwtTokenUtil.getUsernameFromToken(token);
//        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
//        return user;
//    }

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public List<AuthorityModel> getAuthoritiesUser(){
        return authorityService.getAuthorityBySelf();
    }

    @RequestMapping(value = "/school", method = RequestMethod.GET)
    public SchoolModel getSchoolUser(){
        return schoolService.getSchoolBySelf();
    }
}
