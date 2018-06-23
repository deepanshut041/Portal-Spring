package in.futurastic.portal.service.profile;

import in.futurastic.portal.model.profile.StudentProfileModel;

public interface StudentProfileService {
    StudentProfileModel getSelfProfile();
    StudentProfileModel createStudentWithUser(StudentProfileModel studentProfileModel);
}
