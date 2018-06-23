package in.futurastic.portal.controller;

import in.futurastic.portal.model.profile.StudentProfileModel;
import in.futurastic.portal.service.profile.StudentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

//    This is only for admin
    @Autowired
    StudentProfileService studentProfileService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public StudentProfileModel createStudent(@RequestBody StudentProfileModel studentProfileModel){
        return studentProfileService.createStudentWithUser(studentProfileModel);
    }
}
