package com.gsu.notepadplus.listeners;

import com.gsu.notepadplus.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
