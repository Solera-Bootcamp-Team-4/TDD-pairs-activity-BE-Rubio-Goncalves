package com.solera.rubiogoncalves.airlinesapp.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleWebApplicationController {

    @RequestMapping("/testing-web-app-test")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }

}
