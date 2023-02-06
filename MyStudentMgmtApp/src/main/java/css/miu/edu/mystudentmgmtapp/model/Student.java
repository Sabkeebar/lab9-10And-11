package css.miu.edu.mystudentmgmtapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {
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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Transcript_id", nullable = true)
    private  Transcript transcripts;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name ="primary_Classroom_id",nullable = true)
    private  Classroom primaryClassroom;
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgp=" + cgp +
                ", dateOfEnrollment=" + dateOfEnrollment +
                '}';
    }
}
