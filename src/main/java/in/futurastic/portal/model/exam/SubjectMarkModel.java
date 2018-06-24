package in.futurastic.portal.model.exam;

import in.futurastic.portal.model.session.SubjectSession;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class SubjectMarkModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private int maxMarks;

    @NotNull
    private int minMarks;

    @ManyToOne
    private SubjectSession subjectSession;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public int getMinMarks() {
        return minMarks;
    }

    public void setMinMarks(int minMarks) {
        this.minMarks = minMarks;
    }

    public SubjectSession getSubjectSession() {
        return subjectSession;
    }

    public void setSubjectSession(SubjectSession subjectSession) {
        this.subjectSession = subjectSession;
    }
}
