package hello.Studyspring;

import hello.Studyspring.repository.MemberRepository;
import hello.Studyspring.repository.MemoryMemberRepository;
import hello.Studyspring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
