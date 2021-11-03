package br.com.letscode.Contact.Dto

data class DtoResponse(
    val ag: String = "",
    val cc: String = "",
    val bank: String = "",
    val type: String,
    val key: String = ""
)

data class ContatosResponse(
    val id: String,
    val contatos: List<DtoResponse>

)
