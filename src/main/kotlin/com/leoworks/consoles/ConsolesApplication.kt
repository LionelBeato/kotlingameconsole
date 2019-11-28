package com.leoworks.consoles

import com.leoworks.consoles.model.Console
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.leoworks.consoles.repo.ConsoleRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ConsolesApplication {

	//code that resolves at runtime that adds items to the repository
	@Bean
	fun init(repository: ConsoleRepository) = CommandLineRunner {
		repository.save(Console("apples", "hello"))
		repository.save(Console("mangoes", "there"))
		repository.save(Console("pears", "lol"))

	}

}

fun main(args: Array<String>) {
	runApplication<ConsolesApplication>(*args)
}
