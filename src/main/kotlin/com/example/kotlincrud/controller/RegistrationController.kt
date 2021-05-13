package com.example.kotlincrud.controller

import com.example.kotlincrud.dtos.Hello
import com.example.kotlincrud.dtos.requests.RegisterRequest
import com.example.kotlincrud.dtos.response.RegisterResponse
import com.example.kotlincrud.service.RegisterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class RegistrationController {

    //Auto-wiring first Service in Kotlin
    @Autowired
    lateinit var registerService: RegisterService;

    @GetMapping("/hello")
    fun helloString(): String {
        return registerService.sayHello()
    }

    //adding an e.p. for data class
    @GetMapping("/data")
    fun helloData() = Hello("Hello from data!")


    @PostMapping("/register")
    fun register(@RequestBody registerRequest: RegisterRequest): RegisterResponse {
        println(registerRequest.name)

        //preparing the response
        var response = RegisterResponse();
        response.name = registerRequest.name;
        return response
    }

}