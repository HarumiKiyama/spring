package pers.spring.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    NoteRepository noteRepository;

    @RequestMapping("/")
    public String index() {
        String s = "Greetings from Spring Boot!";
        Note note = new Note();
        note.title = s;
        note.content = s;
        noteRepository.save(note);
        return s;
    }

}
