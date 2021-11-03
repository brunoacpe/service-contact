package br.com.letscode.Contact.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table
data class Contatos(

    @Id
    var id: String,
    val ag: String = "",
    val cc: String = "",
    val bank: String = "",
    val type: String,
    val key: String = ""

)
