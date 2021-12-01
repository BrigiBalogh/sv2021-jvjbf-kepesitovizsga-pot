package training360.questions;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;
import training360.questions.dto.CreateMemberCommand;
import training360.questions.dto.MemberDto;

import java.lang.reflect.Type;
import java.util.List;

@Service
@AllArgsConstructor
public class MemberService {

    private final ModelMapper mapper;
    private final MemberRepository memberRepository;

    public List<MemberDto> getMembers() {
        Type targetListType = new TypeToken<List<MemberDto>>() {
        }.getType();
        return mapper.map(memberRepository.findAll(), targetListType);
    }

    public MemberDto findMemberById(long id) {
        Member member = findById(id);
        return mapper.map(member, MemberDto.class);
    }

    public MemberDto createMember(CreateMemberCommand command) {
        Member member = memberRepository.save(new Member(command.getName()));
        return mapper.map(member,MemberDto.class);
    }


    public Member findById(Long id) {
        return memberRepository.findById(id)
                .orElseThrow(() -> new MemberNotFoundException(id));
    }
}
