package com.main.demo;
import com.main.demo.models.*;
import com.main.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class MainApplication implements CommandLineRunner {
	@Autowired
	private UserRepo utilisateurRepository;	

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
    @Override
    public void run(String... args) {
        // Ajouter un utilisateur dans la base de données
        User user = new User();
        user.setNom("Elmahdi");
        user.setEmail("elmahdi@example.com");
        UserRepo.save(user);
        System.out.println("Utilisateur ajouté avec succès !");

        // Récupérer tous les utilisateurs
        List<User> utilisateurs = UserRepo.findAll();
        utilisateurs.forEach(u -> System.out.println(u.getNom() + " - " + u.getEmail()));
    }
}
