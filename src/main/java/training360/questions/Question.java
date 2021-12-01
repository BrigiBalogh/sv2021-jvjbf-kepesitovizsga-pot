package training360.questions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean answered;
    private String questionText;
    private String answerText;
    private LocalDateTime createdAt;
    private LocalDateTime createdAtAnswer;


    public Question(boolean answered, String questionText, String answerText,
                    LocalDateTime createdAt, LocalDateTime createdAtAnswer) {
        this.answered = answered;
        this.questionText = questionText;
        this.answerText = answerText;
        this.createdAt = createdAt;
        this.createdAtAnswer = createdAtAnswer;
    }
}
