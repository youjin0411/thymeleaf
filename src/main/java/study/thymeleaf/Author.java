package study.thymeleaf;

import lombok.*;
import java.io.Serializable;
@Data @NoArgsConstructor @AllArgsConstructor
// entity/Author.java
public class Author implements Serializable {
    private String name;
}

