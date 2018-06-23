package in.futurastic.portal.repository.profile;

import in.futurastic.portal.model.profile.StaffProfileModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffProfileRepository extends JpaRepository<StaffProfileModel, Long> {
}
