package com.example.springmvndb.notes;


import com.example.springmvndb.tasks.TaskEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NotesServiceImpl implements NotesService{
    private final NotesRepository notesRepository;

    @Autowired
    public NotesServiceImpl(NotesRepository note) {
        this.notesRepository = note;
    }

    @Override
    public List<NoteEntity> getNotesforTask(TaskEntity task) {
        return notesRepository.findAllByTask(task);
    }

    @Override
    public void addNotetoTask(TaskEntity task, NoteEntity note) {
            note.setTask(task);
            notesRepository.save(note);
    }

    @Override
    public void deleteNote(Long id) {
        notesRepository.deleteById(id);
    }
}
