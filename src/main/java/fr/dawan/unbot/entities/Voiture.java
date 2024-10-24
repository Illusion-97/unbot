package fr.dawan.unbot.entities;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(fluent = true)
public class Voiture implements Serializable {
    private String marque;
    private String modele;
    private String couleur;
}
