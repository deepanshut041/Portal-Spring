package in.futurastic.portal.model.grade;

import com.fasterxml.jackson.annotation.JsonIgnore;
import in.futurastic.portal.model.session.ClassSession;

import javax.persistence.*;
import java.util.List;

@Entity
public class ClassModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String section;

    @JsonIgnore
    @OneToMany(mappedBy = "classModel")
    private List<ClassSession> classSessions;

    public ClassModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public List<ClassSession> getClassSessions() {
        return classSessions;
    }

    public void setClassSessions(List<ClassSession> classSessions) {
        this.classSessions = classSessions;
    }
}
