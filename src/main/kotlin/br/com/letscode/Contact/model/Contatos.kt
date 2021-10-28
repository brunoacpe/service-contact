package br.com.letscode.Contact.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table
data class Contatos(
    @Id
    val id: String,
    val lista: List<>
)
