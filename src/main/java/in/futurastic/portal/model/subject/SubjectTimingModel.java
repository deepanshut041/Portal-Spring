package in.futurastic.portal.model.subject;


import in.futurastic.portal.model.session.SubjectSession;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;

@Entity
public class SubjectTimingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @ManyToOne
    private SubjectSession subjectSession;

    @DateTimeFormat(pattern="hh:mm:ss" )
    @NotNull
    private Time startTime;

    @DateTimeFormat(pattern="hh:mm:ss" )
    @NotNull
    private Time endTime;

    @NotNull
    private String day;

    public SubjectTimingModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SubjectSession getSubjectSession() {
        return subjectSession;
    }

    public void setSubjectSession(SubjectSession subjectSession) {
        this.subjectSession = subjectSession;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
