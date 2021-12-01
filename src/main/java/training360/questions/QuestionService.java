package training360.questions;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import training360.questions.dto.CreateQuestionCommand;
import training360.questions.dto.QuestionDto;

import java.util.List;

@Service
@AllArgsConstructor
public class QuestionService {



    private final ModelMapper mapper;
    private final QuestionRepository questionRepository;

    public List<QuestionDto> getQuestions(Long id) {
    }

    public QuestionDto findQuestionById(Long id, Long questionId) {
    }

    public QuestionDto createQuestion(Long id, CreateQuestionCommand command) {
    }
}
