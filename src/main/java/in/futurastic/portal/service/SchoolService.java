package in.futurastic.portal.service;

import in.futurastic.portal.model.SchoolModel;

public interface SchoolService {
    SchoolModel getSchoolBySelf();
    SchoolModel createNewSchool(SchoolModel schoolModel);
    SchoolModel getSchoolById(long id);
}
