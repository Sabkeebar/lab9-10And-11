package css.miu.edu.mystudentmgmtapp.service.imp;

import css.miu.edu.mystudentmgmtapp.model.Classroom;
import css.miu.edu.mystudentmgmtapp.repository.ClassRoomRepository;
import css.miu.edu.mystudentmgmtapp.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ClassRoomImp implements ClassRoomService {
    @Autowired
    private ClassRoomRepository classRoomRepository;
    @Override
    public Classroom addNewClassRoom(Classroom newClassroom) {
        return classRoomRepository.save(newClassroom) ;
    }
}
