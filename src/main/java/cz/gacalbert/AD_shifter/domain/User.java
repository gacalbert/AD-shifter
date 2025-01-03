package cz.gacalbert.AD_shifter.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
public class User {
    @Setter
    private String cookie;
    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String password;

    public User(String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = lastName + "." + firstName;
        this.password = password;
    }
}
