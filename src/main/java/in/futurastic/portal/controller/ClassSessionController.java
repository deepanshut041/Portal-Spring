package in.futurastic.portal.controller;

import in.futurastic.portal.model.session.ClassSession;
import in.futurastic.portal.service.grade.ClassService;
import in.futurastic.portal.service.profile.StaffProfileService;
import in.futurastic.portal.service.session.ClassSessionService;
import in.futurastic.portal.service.session.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/api/v1/classsession")
public class ClassSessionController {
    @Autowired
    ClassSessionService classSessionService;

    @Autowired
    SessionService sessionService;

    @Autowired
    StaffProfileService staffProfileModelService;

    @Autowired
    ClassService classService;


    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    ClassSession createClassSession(@RequestBody ClassSession classSession){
        return classSessionService.createSession(classSession);
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    List<ClassSession> getClassSessions(){
        return classSessionService.getAllClassSession();
    }

    @RequestMapping(value = "/session/{id}", method = RequestMethod.GET)
    List<ClassSession> getClassSessionByStaff(@PathVariable int id){

        return classSessionService.getClassSessionByStaff();
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    List<ClassSession> getClassSession(){
        return classSessionService.getAllClassSession();
    }
}
