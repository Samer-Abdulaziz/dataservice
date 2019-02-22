package com.ws.dataserice.repository;


import com.ws.dataserice.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sabdulaziz on 2/22/19.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
