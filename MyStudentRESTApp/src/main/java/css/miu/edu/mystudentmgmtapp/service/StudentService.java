package css.miu.edu.mystudentmgmtapp.service;

import css.miu.edu.mystudentmgmtapp.dto.StudentRequest;
import css.miu.edu.mystudentmgmtapp.exception.StudentNotFoundException;
import css.miu.edu.mystudentmgmtapp.model.Student;

import java.util.List;

public interface StudentService {
   Student addNewStudent(StudentRequest newStudentRequest);
   Student getStudentById(Integer studentId) throws StudentNotFoundException;
   List<Student> getAllStudent();

   Student updateStudent(StudentRequest updateStudentRequest, Integer studentId);
   public abstract void deleteStudentById(Integer studentId);
  // List<Student> searchStudent(String searchString);
   Student searchStudentByFirstName(String nameStart);
}
