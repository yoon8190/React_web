package com.example.reactProject.reactController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;

@Controller
public class RestController {
    @GetMapping("/api/hello")
    @ResponseBody 
    public String hello() {
        return "집가고싶다" + new Date() + "\n";
    }
}
