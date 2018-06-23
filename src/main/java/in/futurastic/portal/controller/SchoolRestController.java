package in.futurastic.portal.controller;

import in.futurastic.portal.model.SchoolModel;
import in.futurastic.portal.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/school")
public class SchoolRestController {
    @Autowired
    SchoolService schoolService;

//  This function will only for super admin(Company)
    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST)
    public SchoolModel createSchoolUser(@RequestBody SchoolModel schoolModel){
        return schoolService.createNewSchool(schoolModel);
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public SchoolModel getSchoolUser(@PathVariable long id){
        return schoolService.getSchoolById(id);
    }

}
