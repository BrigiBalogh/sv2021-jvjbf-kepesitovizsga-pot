package training360.questions;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class QuestionService {



    private final ModelMapper mapper;
    private final QuestionRepository questionRepository;

}
