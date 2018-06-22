package in.futurastic.portal.controller;

import in.futurastic.portal.model.auth.AuthorityModel;
import in.futurastic.portal.model.auth.JwtUser;
import in.futurastic.portal.service.auth.AuthorityService;
import in.futurastic.portal.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/v1/shared")
public class SharedRestController {
    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private AuthorityService authorityService;

    @Autowired
    @Qualifier("jwtUserDetailsService")
    private UserDetailsService userDetailsService;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public JwtUser getProfileAuthenticatedUser(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader).substring(7);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);

        return user;
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public JwtUser getMenuAuthenticatedUser(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader).substring(7);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);

        return user;
    }

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public List<AuthorityModel> getAuthoritiesUser(){
        return authorityService.getAuthorityByUsername();
    }
}
