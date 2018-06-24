package in.futurastic.portal.service.grade;

import in.futurastic.portal.model.grade.ClassModel;
import in.futurastic.portal.repository.grade.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("classService")
public class ClassServiceImpl implements ClassService {

    @Autowired
    ClassRepository classRepository;

    @Override
    public ClassModel createNew(ClassModel classModel) {
        return classRepository.save(classModel);
    }

    @Override
    public List<ClassModel> getAllClasses() {
        return classRepository.findAll();
    }
}
