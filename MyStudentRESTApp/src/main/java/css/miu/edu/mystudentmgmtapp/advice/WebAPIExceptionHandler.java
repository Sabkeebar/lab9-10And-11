package css.miu.edu.mystudentmgmtapp.advice;

import css.miu.edu.mystudentmgmtapp.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class WebAPIExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(StudentNotFoundException.class)
    public Map<String, String> handleWebAPIException(StudentNotFoundException studentNotFoundException){
        Map<String,String> errorMap= new HashMap<>();
        errorMap.put("errorMessage", studentNotFoundException.getMessage());
        return errorMap;
    }
}
