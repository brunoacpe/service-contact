package br.com.letscode.Contact.service


import br.com.letscode.Contact.model.Contatos
import br.com.letscode.Contact.repository.contatosRepository
import org.springframework.stereotype.Service

@Service
class contatosService(val repository: contatosRepository) {

    fun saveContatos(contatos: List<Contatos>,sub: String?) = run {
        contatos.forEach{
            it.id = sub!!
            repository.save(it)
        }
        contatos
    }
}