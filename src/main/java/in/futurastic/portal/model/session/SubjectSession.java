package in.futurastic.portal.model.session;

import in.futurastic.portal.model.profile.StaffProfileModel;
import in.futurastic.portal.model.subject.SubjectModel;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class SubjectSession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @ManyToOne
    private ClassSession classSession;

    @NotNull
    @ManyToOne
    private SubjectModel subjectModel;

    @NotNull
    @ManyToOne
    private StaffProfileModel staffProfileModel;

    public SubjectSession() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ClassSession getClassSession() {
        return classSession;
    }

    public void setClassSession(ClassSession classSession) {
        this.classSession = classSession;
    }

    public SubjectModel getSubjectModel() {
        return subjectModel;
    }

    public void setSubjectModel(SubjectModel subjectModel) {
        this.subjectModel = subjectModel;
    }

    public StaffProfileModel getStaffProfileModel() {
        return staffProfileModel;
    }

    public void setStaffProfileModel(StaffProfileModel staffProfileModel) {
        this.staffProfileModel = staffProfileModel;
    }
}
