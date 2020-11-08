package application.controller;

import application.dao.AdminsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    AdminsRepository adminsRepository;

    @GetMapping("/helloWorld")
    public String getHelloWorld(){
        System.out.println("GetHelloWolrd");
        return "HelloWorld !";
    }

}
