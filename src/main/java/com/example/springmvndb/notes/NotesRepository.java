package com.example.springmvndb.notes;

import com.example.springmvndb.tasks.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepository extends JpaRepository<NoteEntity,Long> {
    List<NoteEntity> findAllByTask(TaskEntity task);
}
