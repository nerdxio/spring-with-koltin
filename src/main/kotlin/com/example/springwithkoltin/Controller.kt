package com.example.springwithkoltin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @GetMapping("/api")
    fun getUsers():List<User>{
        return arrayListOf(
            User("hassan",1),
            User("Ali",2),
            User("abdo",3)
        )
    }

}