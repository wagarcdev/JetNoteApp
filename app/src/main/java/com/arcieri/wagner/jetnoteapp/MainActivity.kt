package com.arcieri.wagner.jetnoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.arcieri.wagner.jetnoteapp.screen.NoteScreen
import com.arcieri.wagner.jetnoteapp.screen.NoteViewModel
import com.arcieri.wagner.jetnoteapp.ui.theme.JetNoteAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetNoteAppTheme {

                val noteViewModel: NoteViewModel = viewModel()

                NotesApp(noteViewModel)




            }
        }
    }
}

@Composable
fun NotesApp(noteViewModel: NoteViewModel) {

    val notesList = noteViewModel.noteList.collectAsState().value

    NoteScreen(
        notes = notesList,
        onAddNote = { noteViewModel.addNote(it) },
        onRemoveNote = { noteViewModel.removeNote(it) }
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetNoteAppTheme {

    }
}