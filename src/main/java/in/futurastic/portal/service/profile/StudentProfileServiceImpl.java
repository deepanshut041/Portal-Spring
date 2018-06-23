package in.futurastic.portal.service.profile;

import in.futurastic.portal.model.profile.StudentProfileModel;
import in.futurastic.portal.repository.profile.StudentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentProfileService")
public class StudentProfileServiceImpl implements StudentProfileService {
    @Autowired
    StudentProfileRepository studentProfileRepository;

    @Override
    public StudentProfileModel getSelfProfile() {
        return null;
    }

    @Override
    public StudentProfileModel createStudentWithUser(StudentProfileModel studentProfileModel) {
        return null;
    }
}
