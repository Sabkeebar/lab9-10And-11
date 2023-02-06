package css.miu.edu.mystudentmgmtapp.dto;

import css.miu.edu.mystudentmgmtapp.model.Classroom;
import css.miu.edu.mystudentmgmtapp.model.Transcript;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Getter
@Setter

public class StudentRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    @NotBlank(message = "student number is required")
    private String studentNumber;
    @NotBlank(message = "first is required")
    private  String firstName;
    private  String middleName;
    @NotBlank(message = "last is required")
    private  String lastName;
    private Float cgp;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate dateOfEnrollment;
    private Boolean isInternation;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="Transcript_id", nullable = true)
    private Transcript transcripts;
//    @ManyToOne (cascade = CascadeType.ALL)
//    @JoinColumn(name ="primary_Classroom_id",nullable = true)
    private Classroom primaryClassroom;

}
