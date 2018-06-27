package in.futurastic.portal.controller;

import in.futurastic.portal.model.profile.StaffProfileModel;
import in.futurastic.portal.model.session.ClassSession;
import in.futurastic.portal.service.auth.AuthorityService;
import in.futurastic.portal.service.profile.StaffProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/staff")
public class StaffController {
    @Autowired
    StaffProfileService staffProfileService;

    @Autowired
    AuthorityService authorityService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    StaffProfileModel createStaff(@RequestBody StaffProfileModel staffProfileModel){
        return staffProfileService.createNewStaffModel(staffProfileModel);
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    List<StaffProfileModel> getClassSessions(){
        return staffProfileService.getAllStaffModels();
    }
}
