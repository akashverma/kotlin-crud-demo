package com.example.kotlincrud.repos

import com.example.kotlincrud.dtos.jpa.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : CrudRepository<Student, Long>{

}
