package css.miu.edu.mystudentmgmtapp.repository;

import css.miu.edu.mystudentmgmtapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
  //  @Query(value = "select p from Publisher p where p.name = :name")
   // Optional<Publisher> getPublisherByName(String name);

   // @Query(value = "select * from publishers p where p.publisher_name like %?1%", nativeQuery = true)
  //  Optional<Publisher> getPublisherWhereNameStartsWith(String nameStart);
    @Query(value = "select s from Student s where s.lastName =:lastName")
    Optional<Student> getStudentByLastName(String lastName);
  //  @Query(value = "select * from students s where s.first_name like %?1%", nativeQuery = true)
    //Optional<Student>   getPublisherWhereNameStartsWith(String nameStart);


}
