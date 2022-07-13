package com.bridgelabz.hellomessagingapp.controller;


import com.bridgelabz.hellomessagingapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    //* UC - 1 ------------------>
    @GetMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello Everyone!!!";
    }

    @GetMapping(value = {"/hello -w"})
    public String sayHelloDifferently()
    {
        return "Hello  from BridgeLabz !!!";
    }

    //* UC - 2 --------------------->
    @GetMapping(value = {"/query"})
    public String sayHello(@RequestParam(value = "name") String name)
    {
        return "Hello " + name  + " from Bridgelabz !!!";
    }
    
    //* UC - 3 ----------------------->
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name)
    {
        return "Hello " + "Mr/Mrs." + name  + "!!!";
    }

    //*UC - 4 ------------------------->
    @PostMapping("/post")
    public String sayHello(@RequestBody User user)
    {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from Bridgelabz!!!";
    }
    
    //*UC - 5 ------------------------->
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName)
    {
        return "Hello " + firstName + " " + lastName + " from Bridgelabz!!!";
    }
}
