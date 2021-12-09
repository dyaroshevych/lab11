package user;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.Singular;

import java.util.List;

@Builder @ToString @Getter
public class User {
    private String name;
    private int age;
    private int weight;
    private int height;
    private String race;

    @Singular
    private List<String> occupations;
}