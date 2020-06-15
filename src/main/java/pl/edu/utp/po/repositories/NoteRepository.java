package pl.edu.utp.po.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.edu.utp.po.domain.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
	List<Note> findByOrderByTimestampDesc();
}