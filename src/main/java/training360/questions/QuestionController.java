package training360.questions;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import training360.questions.dto.CreateMemberCommand;
import training360.questions.dto.CreateQuestionCommand;
import training360.questions.dto.MemberDto;
import training360.questions.dto.QuestionDto;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/members/{id}/questions")
@RequiredArgsConstructor
@Tag(name = "Operations on question")
public class QuestionController {


    private final QuestionService questionService;


    @GetMapping
    @Operation(summary = "list all question")
    @ApiResponse(responseCode = "404", description = "member not found by id")
    public List<QuestionDto> getQuestions(@PathVariable Long id) {
        return questionService.getQuestions(id);
    }


    @GetMapping("/{question-id}")
    @Operation(summary = "get a question")
    @ApiResponse(responseCode = "201", description = "question is  found ")
    @ApiResponse(responseCode = "404", description = "question not found ")
    public QuestionDto findQuestionById(
            @PathVariable("id") Long id,
            @PathVariable("lesson-id") Long questionId) {
        return questionService.findQuestionById(id, questionId);
    }




    @PostMapping
    @Operation(summary = "Creates a question", description = " New question has been created.")
    @ApiResponse(responseCode = "201", description = "question is  create")
    @ApiResponse(responseCode = "404", description = "question not found by id")
    public QuestionDto createQuestion(
            @PathVariable Long id,
            @Valid @RequestBody CreateQuestionCommand command) {
        return questionService.createQuestion(id, command);
    }

}
