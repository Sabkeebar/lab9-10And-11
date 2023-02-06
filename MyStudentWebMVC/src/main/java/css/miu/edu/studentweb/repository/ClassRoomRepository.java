package css.miu.edu.studentweb.repository;

import css.miu.edu.studentweb.model.Classroom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends CrudRepository<Classroom,Integer> {
}
