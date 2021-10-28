package br.com.letscode.Contact.controller

import br.com.letscode.Contact.model.Contatos
import br.com.letscode.Contact.service.contatosService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("contatos")
@RestController
class contatosController(val service: contatosService) {

    @PostMapping
    fun addContatos(@RequestBody contato: Contatos): ResponseEntity<Contatos> = run {
        ResponseEntity.ok(service.saveContatos(contato))
    }

}