package css.miu.edu.mystudentmgmtapp.repository;

import css.miu.edu.mystudentmgmtapp.model.Transcript;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranscriptRepository extends CrudRepository<Transcript,Integer> {
}
