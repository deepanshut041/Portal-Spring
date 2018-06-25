package in.futurastic.portal.service.session;

import in.futurastic.portal.model.grade.ClassModel;
import in.futurastic.portal.model.profile.StaffProfileModel;
import in.futurastic.portal.model.session.ClassSession;
import in.futurastic.portal.model.session.SessionModel;

import java.util.List;

public interface ClassSessionService {
    ClassSession createSession(ClassSession classSession);
    List<ClassSession> getAllClassSession();
    List<ClassSession> getClassSessionByClass(ClassModel classModel);
    List<ClassSession> getClassSessionBySession(SessionModel sessionModel);
    List<ClassSession> getClassSessionByStaff(StaffProfileModel staffProfileModel);
}
