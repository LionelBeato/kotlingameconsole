package com.leoworks.consoles.controller

import com.leoworks.consoles.service.ConsoleServiceImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class ConsoleController (val consoleservice: ConsoleServiceImpl) {




    @GetMapping("/")
    fun getAll() = consoleservice.getAll()



}