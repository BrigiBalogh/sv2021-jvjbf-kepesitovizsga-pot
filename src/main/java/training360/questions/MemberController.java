package training360.questions;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import training360.questions.dto.CreateMemberCommand;
import training360.questions.dto.MemberDto;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/ members")
@RequiredArgsConstructor
@Tag(name = "Operations on  member")
public class MemberController {

    private final MemberService memberService;


    @GetMapping
    @Operation(summary = "list all members")
    public List<MemberDto> getMembers() {
        return memberService. getMembers();
    }


    @GetMapping("/{id}")
    @Operation(summary = "get a member")
    @ApiResponse(responseCode = "201", description = "member is  found")
    public MemberDto findMemberById(@PathVariable("id") long id) {
        return memberService.findMemberById(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Creates a member", description = " New member has been created.")
    @ApiResponse(responseCode = "201", description = "member is  create")
    @ApiResponse(responseCode = "400", description = "member is validation exception ")
    public MemberDto createMember(@Valid @RequestBody CreateMemberCommand command) {
        return memberService. createMember(command);
    }

}
