package training360.questions;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.net.URI;

public class MemberNotFoundException extends AbstractThrowableProblem {


    public MemberNotFoundException(Long id) {

        super(URI.create("member/not-found"),
                "Member not found",
                Status.NOT_FOUND,
                String.format("Not found with id '%d'", id));
    }
}
