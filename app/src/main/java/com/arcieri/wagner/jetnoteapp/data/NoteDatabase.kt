package com.arcieri.wagner.jetnoteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.arcieri.wagner.jetnoteapp.model.Note
import com.arcieri.wagner.jetnoteapp.util.DateConverter

@Database(entities = [Note::class], version = 2, exportSchema = false)
@TypeConverters(DateConverter::class)
abstract class NoteDatabase: RoomDatabase() {

    abstract fun noteDAO(): NoteDatabaseDAO

}