package in.futurastic.portal.controller;

import in.futurastic.portal.model.grade.ClassModel;
import in.futurastic.portal.service.grade.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    // This is only for super user
    @RequestMapping(value = {"","/"}, method = RequestMethod.POST)
    public ClassModel createNewClass(@RequestBody ClassModel classModel){
        return classService.createNew(classModel);
    }

    @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
    public List<ClassModel> getAllClass(){
        return classService.getAllClasses();
    }

}
