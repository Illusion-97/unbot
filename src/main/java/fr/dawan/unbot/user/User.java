package fr.dawan.unbot.user;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(fluent = true)
public class User implements Serializable {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
}
