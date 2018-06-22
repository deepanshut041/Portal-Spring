package in.futurastic.portal.repository.auth;

import in.futurastic.portal.model.auth.AuthorityModel;
import in.futurastic.portal.model.auth.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AuthorityRepository extends JpaRepository<AuthorityModel, Long> {
    List<AuthorityModel> findAllByUsers(List<User> users);
}

