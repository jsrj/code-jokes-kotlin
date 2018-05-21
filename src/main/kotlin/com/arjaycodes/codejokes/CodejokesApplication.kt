package com.arjaycodes.codejokes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CodejokesApplication

fun main(args: Array<String>) {
    print("foo");
    runApplication<CodejokesApplication>(*args)
}
