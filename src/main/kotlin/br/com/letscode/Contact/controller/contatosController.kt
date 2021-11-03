package br.com.letscode.Contact.controller

import br.com.letscode.Contact.Dto.ContatosResponse
import br.com.letscode.Contact.Dto.DtoResponse
import br.com.letscode.Contact.configs.JwtUtil
import br.com.letscode.Contact.model.Contatos
import br.com.letscode.Contact.service.contatosService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("contatos")
@RestController
class contatosController(val service: contatosService,val jwt: JwtUtil) {

    @GetMapping
    fun getContatos(@RequestHeader toke: String): ResponseEntity<ContatosResponse> = run{
        val sub = jwt.getClaimsToken(toke)?.subject
        ResponseEntity.ok(service.getContatos(sub))
    }

    @PostMapping
    fun addContatos(@RequestBody contato: List<DtoResponse>, @RequestHeader toke: String): ResponseEntity<List<DtoResponse>> = run {
        val sub = jwt.getClaimsToken(toke)?.subject
        ResponseEntity.ok(service.saveContatos(contato,sub))
    }

}