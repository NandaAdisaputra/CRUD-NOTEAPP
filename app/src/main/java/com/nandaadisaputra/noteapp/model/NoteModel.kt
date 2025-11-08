package com.nandaadisaputra.noteapp.model

data class NoteResponse(
    val code: Int,
    val status: String,
    val message: String,
    val data: List<Note>
)
data class SingleNoteResponse(
    val code: Int,
    val status: String,
    val message: String,
    val data: Note
)

data class Note (
    val id : Int,
    val title: String,
    val description: String
)
