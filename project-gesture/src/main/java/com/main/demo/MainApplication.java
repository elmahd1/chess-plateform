package com.main.demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MainApplication implements CommandLineRunner {
	

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
    @Override
    public void run(String... args) {
        // Ajouter un utilisateur dans la base de données
      
    }
}
