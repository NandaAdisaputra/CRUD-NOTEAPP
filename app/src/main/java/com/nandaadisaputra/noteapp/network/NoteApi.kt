package com.nandaadisaputra.noteapp.network

import com.nandaadisaputra.noteapp.utils.e

object NoteApi {

    // Fungsi untuk mendapatkan semua catatan (menggunakan GET)
    fun getNotes(): String = ApiRequest.get("getnotes")

    // Fungsi untuk mendapatkan detail catatan berdasarkan ID (menggunakan GET)
    fun getNoteById(id: String): String = ApiRequest.get("getnotebyid&id=${id.e()}")

    // Fungsi untuk menampilkan catatan dengan token dan paginasi
    fun getNotesPaginatedWithToken(page: Int, limit: Int, token: String): String {
        return ApiRequest.get("getnotespaginatedwithtoken&page=$page&limit=$limit&token=${token.e()}")
    }
    // Fungsi untuk mencari catatan berdasarkan query tertentu (menggunakan GET)
    fun searchNotes(query: String): String = ApiRequest.get("searchnotes&query=${query.e()}")

    // Fungsi untuk menambahkan catatan baru (menggunakan POST)
    fun addNote(title: String, description: String): String {
        return ApiRequest.post("endpoint=add_note&title=${title.e()}&description=${description.e()}")
    }
    // Fungsi untuk mengupdate catatan berdasarkan ID (menggunakan POST)
    fun updateNote(id: String, title: String, description: String): String {
        return ApiRequest.post("endpoint=update_note&id=${id.e()}&title=${title.e()}&description=${description.e()}")
    }

    // Fungsi untuk menghapus catatan berdasarkan ID (menggunakan POST)
    fun deleteNote(id: String): String {
        return ApiRequest.post("endpoint=delete_note&id=${id.e()}")
    }
}
