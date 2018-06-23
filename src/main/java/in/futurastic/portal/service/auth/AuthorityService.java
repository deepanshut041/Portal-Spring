package in.futurastic.portal.service.auth;

import in.futurastic.portal.model.auth.AuthorityModel;

import java.util.List;

public interface AuthorityService {
    List<AuthorityModel> getAuthorityBySelf();
    AuthorityModel addAuthority(AuthorityModel authorityModel);
    List<AuthorityModel> getAllAuthority();

}
