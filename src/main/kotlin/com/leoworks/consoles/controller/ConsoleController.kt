package com.leoworks.consoles.controller

import com.leoworks.consoles.service.ConsoleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class ConsoleController (val consoleservice: ConsoleService) {




    @GetMapping("/")
    fun getAll() = consoleservice.getAll()



}