package css.miu.edu.mystudentmgmtapp.service.imp;

import css.miu.edu.mystudentmgmtapp.dto.StudentRequest;
import css.miu.edu.mystudentmgmtapp.exception.StudentNotFoundException;
import css.miu.edu.mystudentmgmtapp.model.Student;
import css.miu.edu.mystudentmgmtapp.repository.StudentRepository;
import css.miu.edu.mystudentmgmtapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student addNewStudent(StudentRequest newStudentRequest) {
        var newStudent =Student.build(null,newStudentRequest.getStudentNumber(),newStudentRequest.getFirstName(),
                newStudentRequest.getMiddleName(), newStudentRequest.getLastName(),newStudentRequest.getCgp(),
                newStudentRequest.getDateOfEnrollment(),newStudentRequest.getIsInternation(),newStudentRequest.getTranscripts(),newStudentRequest.getPrimaryClassroom() );
        return studentRepository.save(newStudent);
    }

    @Override
    public Student getStudentById(Integer studentId) throws StudentNotFoundException{
       // return studentRepository.findById(studentId).orElse(null);
        return studentRepository.findById(studentId).orElseThrow(() ->
                new StudentNotFoundException(String.format("Student with Id %d is not found", studentId)));
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(StudentRequest updateStudentRequest, Integer studentId) {
        var updateStudent = Student.build(null,
                updateStudentRequest.getStudentNumber(), updateStudentRequest.getFirstName(), updateStudentRequest.getMiddleName(),
                updateStudentRequest.getLastName(),updateStudentRequest.getCgp(),
                updateStudentRequest.getDateOfEnrollment(),updateStudentRequest.getIsInternation(),
                updateStudentRequest.getTranscripts(),updateStudentRequest.getPrimaryClassroom());
        return studentRepository.save(updateStudent);

    }

    @Override
    public void deleteStudentById(Integer studentId) {
        studentRepository.deleteById(studentId);

    }

    @Override
    public Student searchStudentByFirstName(String nameStart) {
        return studentRepository.getStudentByLastName(nameStart).orElse(null);
    }

//    @Override
//    public List<Student> searchStudent(String searchString) {
//        return null;
  //  }
}
