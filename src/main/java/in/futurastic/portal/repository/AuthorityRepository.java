package in.futurastic.portal.repository;

import in.futurastic.portal.model.auth.AuthorityModel;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<AuthorityModel, Long> {
}
