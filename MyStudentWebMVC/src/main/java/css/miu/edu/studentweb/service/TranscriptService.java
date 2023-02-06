package css.miu.edu.studentweb.service;

import css.miu.edu.studentweb.model.Transcript;

public interface TranscriptService {
    Transcript addNewTranscript(Transcript newTranscript);
    Transcript getTranscriptById(Integer transcriptId);
}
