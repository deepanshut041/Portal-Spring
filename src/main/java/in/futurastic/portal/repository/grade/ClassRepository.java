package in.futurastic.portal.repository.grade;

import in.futurastic.portal.model.grade.ClassModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassModel, Long> {
}
