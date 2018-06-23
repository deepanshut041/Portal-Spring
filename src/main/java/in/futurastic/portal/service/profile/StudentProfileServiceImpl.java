package in.futurastic.portal.service.profile;

import in.futurastic.portal.model.auth.AuthorityModel;
import in.futurastic.portal.model.auth.User;
import in.futurastic.portal.model.profile.StudentProfileModel;
import in.futurastic.portal.repository.auth.UserRepository;
import in.futurastic.portal.repository.profile.StudentProfileRepository;
import in.futurastic.portal.service.auth.AuthorityService;
import in.futurastic.portal.service.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentProfileService")
public class StudentProfileServiceImpl implements StudentProfileService {
    @Autowired
    StudentProfileRepository studentProfileRepository;

    @Autowired
    UserService userService;

    @Autowired
    AuthorityService authorityService;

    @Override
    public StudentProfileModel getSelfProfile() {
        return null;
    }

    @Override
    public StudentProfileModel createStudentWithUser(StudentProfileModel studentProfileModel) {
        User user = studentProfileModel.getUser();
        user.setAuthorities(authorityService.getAuthorityByName("ROLE_STUDENT"));
        userService.saveUser(user);
        studentProfileModel.setUser(user);
        return studentProfileRepository.save(studentProfileModel);
    }
}
