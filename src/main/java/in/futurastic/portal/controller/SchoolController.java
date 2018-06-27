package in.futurastic.portal.controller;

import in.futurastic.portal.model.SchoolModel;
import in.futurastic.portal.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/school")
@PreAuthorize("isAuthenticated()")
// This route can only be accessed by Authenticated user
public class SchoolController {
    @Autowired
    SchoolService schoolService;

//  This function will only for testing purpose
    @PreAuthorize("hasAuthority('ROLE_SUPER_ADMIN')")
    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST)
    public SchoolModel createSchool(@RequestBody SchoolModel schoolModel){
        return schoolService.createNewSchool(schoolModel);
    }

//    This function is get version allowed for everyone
    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public SchoolModel getSchool(@PathVariable long id){
        return schoolService.getSchoolById(id);
    }

//    This function is to update school information and only allowed to super admin or admin
    @PreAuthorize("hasAuthority('ROLE_SUPER_ADMIN')")
    @RequestMapping(value = {"/{id}"}, method = RequestMethod.PUT)
    public SchoolModel updateSchool(@PathVariable long id ,@RequestBody SchoolModel schoolModel){
        return schoolService.updateSchool(id, schoolModel);
    }

}
