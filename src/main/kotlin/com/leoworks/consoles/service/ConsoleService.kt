package com.leoworks.consoles.service

import com.leoworks.consoles.model.Console
import org.springframework.stereotype.Service
import com.leoworks.consoles.repo.ConsoleRepository

@Service
class ConsoleService (val repository: ConsoleRepository){

    fun getAll(): Iterable<Console> = repository.findAll()

}