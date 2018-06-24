package in.futurastic.portal.model.session;

import javax.persistence.*;
import java.util.Date;

@Entity
public class StudentSession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @ManyToOne
    private ClassSession classSession;
    
    @ManyToOne
    private StudentSession studentSession;
    
    @ManyToOne
    private Date enrolledAt;

    public StudentSession() {
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

    public StudentSession getStudentSession() {
        return studentSession;
    }

    public void setStudentSession(StudentSession studentSession) {
        this.studentSession = studentSession;
    }

    public Date getEnrolledAt() {
        return enrolledAt;
    }

    public void setEnrolledAt(Date enrolledAt) {
        this.enrolledAt = enrolledAt;
    }
}
