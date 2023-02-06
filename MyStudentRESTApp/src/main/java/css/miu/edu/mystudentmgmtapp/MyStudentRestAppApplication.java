package css.miu.edu.mystudentmgmtapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyStudentRestAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyStudentRestAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("done");
    }
}
