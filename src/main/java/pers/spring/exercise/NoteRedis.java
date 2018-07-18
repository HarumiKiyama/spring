package pers.spring.exercise;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("Note")
public class NoteRedis implements Serializable {
    public String title;
    public String content;
    @Id
    private String id;
}
