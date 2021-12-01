package training360.questions;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ members")
@RequiredArgsConstructor
@Tag(name = "Operations on  member")
public class MemberController {

    private final MemberService memberService;
}
