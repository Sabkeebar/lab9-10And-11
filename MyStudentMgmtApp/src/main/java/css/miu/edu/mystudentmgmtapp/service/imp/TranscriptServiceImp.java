package css.miu.edu.mystudentmgmtapp.service.imp;

import css.miu.edu.mystudentmgmtapp.model.Transcript;
import css.miu.edu.mystudentmgmtapp.repository.TranscriptRepository;
import css.miu.edu.mystudentmgmtapp.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranscriptServiceImp implements TranscriptService {
    @Autowired
    private TranscriptRepository transcriptRepository;
    @Override
    public Transcript addNewTranscript(Transcript newTranscript) {
        return transcriptRepository.save(newTranscript);
    }

    @Override
    public Transcript getTranscriptById(Integer transcriptId) {
        return transcriptRepository.findById(transcriptId).orElse(null);
    }
}
