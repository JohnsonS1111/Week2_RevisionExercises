package ie.atu.week2exercises;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hi, I am " + name;
    }

    @GetMapping("/details")
    public String getDetails(@RequestParam String name, @RequestParam int age){
        return "Name: " + name + " Age: " + age;
    }

}
