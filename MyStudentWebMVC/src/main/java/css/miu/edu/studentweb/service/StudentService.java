package css.miu.edu.studentweb.service;

import css.miu.edu.studentweb.model.Student;

import java.util.List;

public interface StudentService {
   Student addNewStudent(Student newStudent);
   Student getStudentById(Integer studentId);
   Iterable<Student> getAllStudent();

   Student updateStudent(Student student);
   public abstract void deleteStudentById(Integer studentId);
   List<Student> searchStudent(String searchString);
}
