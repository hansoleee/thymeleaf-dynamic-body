package com.hansoleee.thymeleafdynamicbody;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"/", "index"})
    public String defaultLayout() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "test/hello";
    }

    @GetMapping("/world")
    public String world() {
        return "test/world";
    }
}
