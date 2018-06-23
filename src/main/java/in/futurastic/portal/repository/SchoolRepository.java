package in.futurastic.portal.repository;

import in.futurastic.portal.model.SchoolModel;
import in.futurastic.portal.model.auth.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepository extends JpaRepository<SchoolModel, Long> {
    SchoolModel findByUsers(List<User> users);
}
