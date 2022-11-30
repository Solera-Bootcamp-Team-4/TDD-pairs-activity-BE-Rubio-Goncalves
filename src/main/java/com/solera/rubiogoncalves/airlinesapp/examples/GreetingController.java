package com.solera.rubiogoncalves.airlinesapp.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * So far, our HomeController is simple and has no dependencies.
 * We could make it more realistic by introducing an extra component
 * to store the greeting (perhaps in a new controller).
 *
 * The following example shows how to do so:
 */
@Controller
public class GreetingController {

    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @RequestMapping("/greeting")
    public @ResponseBody String greeting() {
        return service.greet();
    }

}
