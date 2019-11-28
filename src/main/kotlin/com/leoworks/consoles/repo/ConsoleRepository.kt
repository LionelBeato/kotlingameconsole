package com.leoworks.consoles.repo

import org.springframework.data.repository.CrudRepository
import com.leoworks.consoles.model.Console
import org.springframework.data.jpa.repository.JpaRepository

interface ConsoleRepository: JpaRepository<Console, Long> {
 }