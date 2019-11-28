package com.leoworks.consoles.service

import com.leoworks.consoles.model.Console
import org.springframework.stereotype.Service
import com.leoworks.consoles.repo.ConsoleRepository

@Service
class ConsoleServiceImpl (val repository: ConsoleRepository): ComputerServiceInt{

    override fun getAll(): Iterable<Console> = repository.findAll()

    override fun getConsole(): Console {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getConsoleById(): Console {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getConsoleByName(): Console {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}