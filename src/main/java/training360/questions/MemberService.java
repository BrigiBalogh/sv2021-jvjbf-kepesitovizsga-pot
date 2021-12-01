package training360.questions;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberService {

    private final ModelMapper mapper;
    private final MemberRepository memberRepository;

}
