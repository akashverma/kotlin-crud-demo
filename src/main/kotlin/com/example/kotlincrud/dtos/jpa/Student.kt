package com.example.kotlincrud.dtos.jpa

import lombok.Data
import javax.persistence.*

@Data
@Entity(name = "student")
class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Long = 0

    @Column(name = "name")
    var name: String? = null


    var age:String? = null
}
