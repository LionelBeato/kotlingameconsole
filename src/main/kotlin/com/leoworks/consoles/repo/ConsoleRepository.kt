package com.leoworks.consoles.repo

import org.springframework.data.repository.CrudRepository
import com.leoworks.consoles.model.Console

interface ConsoleRepository: CrudRepository<Console, Long> {
 }