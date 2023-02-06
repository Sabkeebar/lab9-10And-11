package css.miu.edu.mystudentmgmtapp.service.imp;

import css.miu.edu.mystudentmgmtapp.model.Student;
import css.miu.edu.mystudentmgmtapp.repository.StudentRepository;
import css.miu.edu.mystudentmgmtapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student addNewStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Iterable<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Integer studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public List<Student> searchStudent(String searchString) {
        return null;
    }
}
