package com.leoworks.consoles.service

import com.leoworks.consoles.model.Console


//this interface/implementation is for scalability
//and easier maintaining

interface ComputerServiceInt {

    fun getAll(): Iterable<Console>
    fun getConsole(): Console
    fun getConsoleById(): Console
    fun getConsoleByName(): Console

}