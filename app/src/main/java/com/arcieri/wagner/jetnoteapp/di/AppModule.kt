package com.arcieri.wagner.jetnoteapp.di

import android.content.Context
import androidx.room.Room
import com.arcieri.wagner.jetnoteapp.data.NoteDatabase
import com.arcieri.wagner.jetnoteapp.data.NoteDatabaseDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideNotesDAO(noteDatabase: NoteDatabase): NoteDatabaseDAO = noteDatabase.noteDAO()

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): NoteDatabase
     = Room.databaseBuilder(
        context,
        NoteDatabase::class.java,
        "notes_db")
        .fallbackToDestructiveMigration()
        .build()

}