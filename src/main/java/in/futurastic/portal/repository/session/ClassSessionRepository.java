package in.futurastic.portal.repository.session;

import in.futurastic.portal.model.grade.ClassModel;
import in.futurastic.portal.model.profile.StaffProfileModel;
import in.futurastic.portal.model.session.ClassSession;
import in.futurastic.portal.model.session.SessionModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassSessionRepository extends JpaRepository<ClassSession, Long> {
    List<ClassSession> findAllByClassModel(ClassModel classModel);
    List<ClassSession> findAllBySessionModel(SessionModel sessionModel);
    List<ClassSession> findAllByStaffProfileModel(StaffProfileModel staffProfileModel);
}
