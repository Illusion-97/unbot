package fr.dawan.unbot;

import fr.dawan.unbot.user.User;
import fr.dawan.unbot.entities.Voiture;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnbotApplication {

	public static void main(String[] args) {
		User u = new User().address("try Again");
		u = new User().name("Yanis");
		u = new User().name("Yanis").phoneNumber("5649854").age(28);
		SpringApplication.run(UnbotApplication.class, args);


		u.name("Yanis").address("Try").phoneNumber("46523132");
		User other = new User();


		//System.out.println("u.name() = \u001B[31m" + u.name() + "\u001B[0m"); // Yanis
		//System.out.println("u.name(\"Other\") = \u001B[31m" + u.name("Other") + "\u001B[0m"); // Yanis - Other - null


		Voiture golf = new Voiture().modele("Golf 7 R 400").couleur("Gris").marque("WG");
		System.out.println("golf = \u001B[31m" + golf + "\u001B[0m");
	}

}
