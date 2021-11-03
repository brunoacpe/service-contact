package br.com.letscode.Contact.controller

import br.com.letscode.Contact.configs.JwtUtil
import br.com.letscode.Contact.model.Contatos
import br.com.letscode.Contact.service.contatosService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("contatos")
@RestController
class contatosController(val service: contatosService,val jwt: JwtUtil) {


    @PostMapping
    fun addContatos(@RequestBody contato: List<Contatos>, @RequestHeader toke: String): ResponseEntity<List<Contatos>> = run {
        val sub = jwt.getClaimsToken(toke)?.subject
        ResponseEntity.ok(service.saveContatos(contato,sub))
    }

}