package in.futurastic.portal.service.session;

import in.futurastic.portal.model.grade.ClassModel;
import in.futurastic.portal.model.profile.StaffProfileModel;
import in.futurastic.portal.model.session.ClassSession;
import in.futurastic.portal.model.session.SessionModel;
import in.futurastic.portal.repository.session.ClassSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("classSessionService")
public class ClassSessionServiceImpl implements ClassSessionService {

    @Autowired
    ClassSessionRepository classSessionRepository;

    @Override
    public ClassSession createSession(ClassSession classSession) {
        return classSessionRepository.save(classSession);
    }

    @Override
    public List<ClassSession> getAllClassSession() {
        return classSessionRepository.findAll();
    }

    @Override
    public List<ClassSession> getClassSessionByClass(ClassModel classModel) {
        return classSessionRepository.findAllByClassModel(classModel);
    }

    @Override
    public List<ClassSession> getClassSessionBySession(SessionModel sessionModel) {
        return classSessionRepository.findAllBySessionModel(sessionModel);
    }

    @Override
    public List<ClassSession> getClassSessionByStaff(StaffProfileModel staffProfileModel) {
        return classSessionRepository.findAllByStaffProfileModel(staffProfileModel);
    }
}
