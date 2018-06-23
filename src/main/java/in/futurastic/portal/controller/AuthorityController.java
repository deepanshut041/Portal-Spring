package in.futurastic.portal.controller;

import in.futurastic.portal.model.SchoolModel;
import in.futurastic.portal.model.auth.AuthorityModel;
import in.futurastic.portal.service.auth.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/authority")
public class AuthorityController {

    @Autowired
    AuthorityService authorityService;

//    This route will be only for super admin
    @RequestMapping(value = {"","/"}, method = RequestMethod.POST)
    public AuthorityModel createAuthority(@RequestBody AuthorityModel authorityModel){
        return authorityService.addAuthority(authorityModel);
    }
    //    This route will be only for super admin
    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public List<AuthorityModel> getAuthority(){
        return authorityService.getAllAuthority();
    }
}
