package in.futurastic.portal.service.profile;

import in.futurastic.portal.model.profile.StaffProfileModel;
import in.futurastic.portal.repository.profile.StaffProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("staffProfileService")
public class StaffProfileServiceImpl implements StaffProfileService {

    @Autowired
    StaffProfileRepository staffProfileRepository;

    @Override
    public StaffProfileModel createNewStaffModel(StaffProfileModel staffProfileModel) {
        return null;
    }

    @Override
    public StaffProfileModel getByStaffModelId(long id) {
        return null;
    }

    @Override
    public List<StaffProfileModel> getAllStaffModels() {
        return null;
    }
}
