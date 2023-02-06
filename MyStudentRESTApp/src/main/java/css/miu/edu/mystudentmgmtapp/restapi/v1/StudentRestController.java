package css.miu.edu.mystudentmgmtapp.restapi.v1;

import css.miu.edu.mystudentmgmtapp.dto.StudentRequest;
import css.miu.edu.mystudentmgmtapp.exception.StudentNotFoundException;
import css.miu.edu.mystudentmgmtapp.model.Student;
import css.miu.edu.mystudentmgmtapp.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/eregistrar/api/student"})
public class StudentRestController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = {"/list"})

    public ResponseEntity<List<Student>> listStudent() {
        return ResponseEntity.ok(studentService.getAllStudent());

    }
    @GetMapping(value = {"/get/{studentId}"})
    public ResponseEntity<Student> getStudentById(@PathVariable Integer studentId) throws StudentNotFoundException {
        return ResponseEntity.ok(studentService.getStudentById(studentId));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<Student> addNewStudent(@Valid @RequestBody StudentRequest studentRequest) {
        return new ResponseEntity<>(studentService.addNewStudent(studentRequest), HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{studentId}")
    public ResponseEntity<Student> updateStudent(@Valid @RequestBody StudentRequest studentRequest,
                                                 @PathVariable Integer studentId) {
        return new ResponseEntity<>(studentService.updateStudent(studentRequest, studentId), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{studentId}")
    public ResponseEntity<Student> deleteStudent(@PathVariable Integer studentId) {
        studentService.deleteStudentById(studentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = {"/search/{nameStart}"})
    public ResponseEntity<Student> searchPublisherByName(@PathVariable String nameStart) {
        return ResponseEntity.ok(studentService.searchStudentByFirstName(nameStart));
    }

}
