package br.com.letscode.Contact.service


import br.com.letscode.Contact.model.Contatos
import br.com.letscode.Contact.repository.contatosRepository
import org.springframework.stereotype.Service

@Service
class contatosService(val repository: contatosRepository) {

    fun saveContatos(contatos: Contatos): Contatos = run {
        repository.save(contatos)
    }
}