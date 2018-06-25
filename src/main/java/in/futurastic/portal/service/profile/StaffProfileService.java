package in.futurastic.portal.service.profile;

import in.futurastic.portal.model.profile.StaffProfileModel;

import java.util.List;

public interface StaffProfileService {
    StaffProfileModel createNewStaffModel(StaffProfileModel staffProfileModel);
    StaffProfileModel getByStaffModelId(long id);
    List<StaffProfileModel> getAllStaffModels();
}
