package training360.questions.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateQuestionCommand {

    @NotNull(message = "must not be null")
    private String questionText;
}
