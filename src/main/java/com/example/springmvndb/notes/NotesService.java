package com.example.springmvndb.notes;


import com.example.springmvndb.tasks.TaskEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface NotesService {
    /**
     * Return all note for a given task
     * @param task
     * @return
     */
    List<NoteEntity> getNotesforTask(TaskEntity task);

    /**
     * Create a new note for a given task
     * @param task
     * @param note
     */
    void addNotetoTask(TaskEntity task,NoteEntity note);

    /**
     * Delete an existing note for a given task
     * @param id
     */
    void deleteNote(Long id);
}
