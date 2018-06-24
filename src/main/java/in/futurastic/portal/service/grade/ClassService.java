package in.futurastic.portal.service.grade;

import in.futurastic.portal.model.grade.ClassModel;

import java.util.List;

public interface ClassService {
    ClassModel createNew(ClassModel classModel);
    List<ClassModel> getAllClasses();
}
