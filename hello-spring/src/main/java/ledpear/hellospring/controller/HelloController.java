package ledpear.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(@RequestParam("name") String name, Model model){
        model.addAttribute("data", name);
        return "hello";
    }

    @GetMapping("hello/test")
    public String hello22(Model model){
        model.addAttribute("data", "helloooooooooo");
        model.addAttribute("data2", "helloooooooooo2");
        return "hello2";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public  String helloString(@RequestParam("name") String name){
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name, @RequestParam("name2") String name2){
        Hello hello = new Hello();
        hello.setName(name);
        hello.setName2(name2);

        return hello;
    }

    static class Hello{
        private String name;
        private String name2;
        private int age = 5;

        public String getName() {
            return name;
        }

        public String getName2() {
            return name2;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setName2(String name) {
            this.name2 = name;
        }
    }
}
