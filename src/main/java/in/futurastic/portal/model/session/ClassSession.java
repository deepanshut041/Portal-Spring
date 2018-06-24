package in.futurastic.portal.model.session;

import in.futurastic.portal.model.grade.ClassModel;
import in.futurastic.portal.model.profile.StaffProfileModel;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames={"class_id", "session_id", "staff_id"})})
public class ClassSession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name="class_id")
    private ClassModel classModel;

    @NotNull
    @ManyToOne
    @JoinColumn(name="session_id")
    private SessionModel sessionModel;

    @NotNull
    @ManyToOne
    @JoinColumn(name="staff_id")
    private StaffProfileModel staffProfileModel;

    public ClassSession() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ClassModel getClassModel() {
        return classModel;
    }

    public void setClassModel(ClassModel classModel) {
        this.classModel = classModel;
    }

    public SessionModel getSessionModel() {
        return sessionModel;
    }

    public void setSessionModel(SessionModel sessionModel) {
        this.sessionModel = sessionModel;
    }

    public StaffProfileModel getStaffProfileModel() {
        return staffProfileModel;
    }

    public void setStaffProfileModel(StaffProfileModel staffProfileModel) {
        this.staffProfileModel = staffProfileModel;
    }
}
