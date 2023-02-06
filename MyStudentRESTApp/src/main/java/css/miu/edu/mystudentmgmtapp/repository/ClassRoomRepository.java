package css.miu.edu.mystudentmgmtapp.repository;

import css.miu.edu.mystudentmgmtapp.model.Classroom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends CrudRepository<Classroom,Integer> {
}
