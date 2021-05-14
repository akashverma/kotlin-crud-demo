package com.example.kotlincrud.service

import com.example.kotlincrud.dtos.jpa.Student
import com.example.kotlincrud.dtos.requests.RegisterRequest
import com.example.kotlincrud.dtos.response.RegisterResponse
import com.example.kotlincrud.repos.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class RegisterService {

    @Autowired
    lateinit var studRepo: StudentRepository

    fun sayHello(): String {
        return "Hello from Service Layer -- Service class";
    }

    fun register(request: RegisterRequest): RegisterResponse {
        var student = Student()
        student.age = request.age
        student.name = request.name

        studRepo.save(student)

        val response = RegisterResponse();
        return response;
    }


    fun getById(sid: String): Student {
        //convert string sid to long
        var optionalStudent = Optional.of(Student::class.java)
        return studRepo.findById(sid.toLong()).get()
    }

}