package com.danilovolles.springbootstart.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloControllerKotlin {
    @GetMapping("/kt")
    fun helloMessageKotlin() = "Olá, Spring Boot com Kotlin!"
}
