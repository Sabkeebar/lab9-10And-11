package css.miu.edu.mystudentmgmtapp;

import css.miu.edu.mystudentmgmtapp.model.Classroom;
import css.miu.edu.mystudentmgmtapp.model.Student;
import css.miu.edu.mystudentmgmtapp.model.Transcript;
import css.miu.edu.mystudentmgmtapp.service.ClassRoomService;
import css.miu.edu.mystudentmgmtapp.service.StudentService;
import css.miu.edu.mystudentmgmtapp.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {

@Autowired
    StudentService studentService;
@Autowired
    TranscriptService transcriptService;
@Autowired
    ClassRoomService classRoomService;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("here we go ...");
        var t1 = new Transcript(null,"BS Computer Science",null);
        var t2 = new Transcript(null,"Msc Computer Science",null);
        var t3 = new Transcript(null,"PHD Server Security",null);
        var t4 = new Transcript(null,"Msc History",null);
        var t5 = new Transcript(null,"BS Biology",null);
        var t6 = new Transcript(null,"BS Sporting",null);

//        var savedt1 = saveTranscript(t1);
//        var savedt2 = saveTranscript(t2);
//        var savedt3 = saveTranscript(t3);
//        var savedt4 = saveTranscript(t4);
//        var savedt5 = saveTranscript(t5);
//        var savedt6 = saveTranscript(t6);


        var s1  = new Student(null,"000-61-0001","Zambia",
                "Lynn","smith",3.65f, LocalDate.of(2019,5,24),
                true,t1,null);
//        var s2  = new Student(null,"111-81-4001","Bob",
//                "Larson","Samson",3.89f, LocalDate.of(2020,1,12),true,t1,null);
//        var s3  = new Student(null,"989-76-1232","Jackson",
//                "Morison","Tuscon",4.0f, LocalDate.of(2014,8,12),false,t3,null);
//        var s4  = new Student(null,"6540-11-9991","Merison",
//                "Lulu","Totti",3.98f, LocalDate.of(2018,11,14),false,t2,null);
//        var s5 =new Student(null,"4444-11-3301","Gugu","Tutu",
//                "Waso",4.00f,LocalDate.of(2011,3,4),true,t4,null);
       // var savedS5 = saveStudent(s5);
      // var savedS1= saveStudent(s1);
//        var savedS2= saveStudent(s2);
//        var savedS3= saveStudent(s3);
//        var savedS4= saveStudent(s4);
//        var student1 = studentService.getStudentById(1);
//        var classroom1 = new Classroom(null, "Verrill Hall", "V14", null);
//        Student updatedStudent1 = null;
//        if(student1 != null) {
//            student1.setPrimaryClassroom(classroom1);
//            updatedStudent1 = studentService.updateStudent(student1);
//        } else {
//            System.out.println("Not found");
//        }
//
     //  System.out.println(updatedStudent1);
//        System.out.println(savedS2);
//        System.out.println(savedS3);
//        System.out.println(savedS4);



//
//
//        // add transcript


    //    System.out.println(savedt1);
//        System.out.println(savedt2);
//        System.out.println(savedt3);
//        System.out.println(savedt4);
//        System.out.println(savedt5);
//        System.out.println(savedt6);
////
//        List<Transcript>l1 = new ArrayList<>();
//        l1.add(t1);
//        l1.add(t2);
//        l1.add(t3);
//        List<Transcript>l2 = new ArrayList<>();
//        l2.add(t4);
//        List<Transcript>l3 = new ArrayList<>();
//        l3.add(t5);
//        l3.add(t6);
//        List<Transcript>l4 = new ArrayList<>();
//        l4.add(t1);
//        l4.add(t2);



//     var studentId =1;
//     var student1 = studentService.getStudentById(studentId);
//
//     var transcriptId =1;
//     var transcript1 =transcriptService.getTranscriptById(transcriptId);
//        if (student1 != null) {
//            student1.setTranscripts(transcript1);
//        } else{
//
//            System.out.println("student id ="+studentId + " does not exist");
//        }
//        studentService.addNewStudent(student1);


//        var classroom1 = new Classroom(null,"McLaugh","12",null);
//        var savedclassroom1 = saveClassroom(classroom1);
//        var classroom2 = new Classroom(null,"Verill","11",null);



        System.out.println("student management app completed");

        // get all

        System.out.println("..........all students ............... ");
        var studentsAll = studentService.getAllStudent();
       for(Student students:studentsAll){
           System.out.println(students);
       }

    }
   Student saveStudent(Student newStudent){
        return studentService.addNewStudent(newStudent);


   }
   Transcript saveTranscript(Transcript newTranscript){
        return transcriptService.addNewTranscript(newTranscript);
   }
    Classroom saveClassroom(Classroom newClassroom){
        return  classRoomService.addNewClassRoom(newClassroom);
    }
}
