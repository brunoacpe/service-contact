package br.com.letscode.Contact.service


import br.com.letscode.Contact.Dto.ContatosResponse
import br.com.letscode.Contact.Dto.DtoResponse
import br.com.letscode.Contact.model.Contatos
import br.com.letscode.Contact.repository.contatosRepository
import org.springframework.stereotype.Service

@Service
class contatosService(val repository: contatosRepository) {

    fun saveContatos(contatos: List<DtoResponse>,sub: String?) = run {
        contatos.forEach{
            repository.save(
                Contatos(
                    id = sub!!,
                    ag = it.ag,
                    cc = it.cc,
                    bank = it.bank,
                    type = it.type,
                    key = it.key
                )
            )
        }
        contatos
    }

    fun getContatos(iD: String?) = run {
        ContatosResponse(
            id = iD!!,
            contatos = repository.findAllById(iD!!)
        )
    }

}