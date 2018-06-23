package in.futurastic.portal.controller;


import in.futurastic.portal.model.session.SessionModel;
import in.futurastic.portal.service.session.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/session")
public class SessionController {

    @Autowired
    SessionService sessionService;

//    Only for admin
    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public SessionModel createSession(@RequestBody SessionModel sessionModel){
        return sessionService.createNewSession(sessionModel);
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public List<SessionModel> getSession(){
        return sessionService.getAllSessions();
    }


}
