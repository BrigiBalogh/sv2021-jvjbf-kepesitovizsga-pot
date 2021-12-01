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
    private final MemberService memberService;
    public List<QuestionDto> getQuestions(Long id) {
    }

    public QuestionDto findQuestionById(Long id, Long questionId) {
        Member member =memberService.findById(id);
        return mapper.map(lessonCompletion, LessonCompletionDto.class);
    }



    public QuestionDto createQuestion(Long id, CreateQuestionCommand command) {
    }
}
