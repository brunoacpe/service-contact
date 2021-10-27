package br.com.letscode.Contact

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ContactApplication

fun main(args: Array<String>) {
	runApplication<ContactApplication>(*args)
}
