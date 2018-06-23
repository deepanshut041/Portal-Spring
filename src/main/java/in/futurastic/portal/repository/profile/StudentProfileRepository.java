package in.futurastic.portal.repository.profile;

import in.futurastic.portal.model.profile.StudentProfileModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepository extends JpaRepository<StudentProfileModel, Long> {
}
