package in.futurastic.portal.repository.session;

import in.futurastic.portal.model.session.SessionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<SessionModel, Long> {

}
