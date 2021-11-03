package br.com.letscode.Contact.repository

import br.com.letscode.Contact.Dto.DtoResponse
import br.com.letscode.Contact.model.Contatos
import org.springframework.data.jpa.repository.JpaRepository

interface contatosRepository: JpaRepository<Contatos, String> {
    fun findAllById(id: String): List<DtoResponse>
}