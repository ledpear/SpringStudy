package hello.Studyspring.controller;

import hello.Studyspring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

//    @Autowired private MemberService memberService;

//    public void setMemberService(MemberService memberService){
//        this.memberService = memberService;
//    }

}
