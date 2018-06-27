package in.futurastic.portal.service;

import in.futurastic.portal.model.SchoolModel;
import in.futurastic.portal.model.auth.JwtUser;
import in.futurastic.portal.model.auth.User;
import in.futurastic.portal.repository.SchoolRepository;
import in.futurastic.portal.repository.auth.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public SchoolModel getSchoolBySelf() {

        JwtUser jwtUser = (JwtUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Optional<User> user = userRepository.findById(jwtUser.getId());
        if (user.isPresent()) {
            List<User> users = new ArrayList<>();
            users.add(user.get());
            return schoolRepository.findByUsers(users);
        }
        return null;
    }

    @Override
    public SchoolModel createNewSchool(SchoolModel schoolModel) {
        return schoolRepository.save(schoolModel);
    }

    @Override
    public SchoolModel getSchoolById(long id) {
        Optional<SchoolModel> schoolModel =  schoolRepository.findById(id);
        if(schoolModel.isPresent()){
            return schoolModel.get();
        }
        return null;
    }

    @Override
    public SchoolModel updateSchool(long id, SchoolModel schoolModel) {
        Optional<SchoolModel> school = schoolRepository.findById(id);
        if (school.isPresent()){
            schoolModel.setId(school.get().getId());
            return schoolRepository.save(schoolModel);
        }
        return null;

    }
}
