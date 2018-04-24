package learn.spring.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ivan Korol on 4/24/2018
 */

@RestController
public class HelloCtrl {
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
}
