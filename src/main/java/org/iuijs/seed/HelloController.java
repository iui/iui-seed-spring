package org.iuijs.seed;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/hello-rest")
    public String index() {
        return "Hello!";
    }

}
