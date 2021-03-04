package ledpear.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    @GetMapping("hello2")
    public String hello22(Model model){
        model.addAttribute("data", "helloooooooooo");
        model.addAttribute("data2", "helloooooooooo2");
        return "hello2";
    }
}
