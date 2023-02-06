package css.miu.edu.mystudentmgmtapp.service;

import css.miu.edu.mystudentmgmtapp.model.Student;
import css.miu.edu.mystudentmgmtapp.model.Transcript;

public interface TranscriptService {
    Transcript addNewTranscript(Transcript newTranscript);
    Transcript getTranscriptById(Integer transcriptId);
}
