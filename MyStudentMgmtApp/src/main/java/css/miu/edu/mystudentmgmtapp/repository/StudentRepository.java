package css.miu.edu.mystudentmgmtapp.repository;

import css.miu.edu.mystudentmgmtapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
