package fr.dawan.unbot.animal;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(fluent = true)
public class Animal implements Serializable {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
}
