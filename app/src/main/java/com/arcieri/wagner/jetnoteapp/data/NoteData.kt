package com.arcieri.wagner.jetnoteapp.data

import com.arcieri.wagner.jetnoteapp.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {

        return listOf(
            Note(title = "bla bla bla", description = "bla bla bla bla bla bla bla bla"),
            Note(title = "bla bla bla", description = "bla bla bla bla bla bla bla bla"),
            Note(title = "bla bla bla", description = "bla bla bla bla bla bla bla bla"),
            Note(title = "bla bla bla", description = "bla bla bla bla bla bla bla bla"),
            Note(title = "bla bla bla", description = "bla bla bla bla bla bla bla bla"),
            Note(title = "bla bla bla", description = "bla bla bla bla bla bla bla bla"),
            Note(title = "bla bla bla", description = "bla bla bla bla bla bla bla bla"),
            Note(title = "bla bla bla", description = "bla bla bla bla bla bla bla bla"),
            Note(title = "bla bla bla", description = "bla bla bla bla bla bla bla bla"),
            Note(title = "bla bla bla", description = "bla bla bla bla bla bla bla bla"),
            Note(title = "bla bla bla", description = "bla bla bla bla bla bla bla bla")
        )
    }
}