package css.miu.edu.studentweb.repository;

import css.miu.edu.studentweb.model.Transcript;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranscriptRepository extends CrudRepository<Transcript,Integer> {
}
