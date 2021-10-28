package br.com.letscode.Contact.repository

import br.com.letscode.Contact.model.Contatos
import org.springframework.data.jpa.repository.JpaRepository

interface contatosRepository: JpaRepository<Contatos, String> {
}