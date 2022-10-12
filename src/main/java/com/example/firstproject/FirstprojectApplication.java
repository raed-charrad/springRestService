package com.example.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.firstproject.dao.OffreRepository;
import com.example.firstproject.entity.Offre;

@SpringBootApplication
public class FirstprojectApplication implements CommandLineRunner {
	@Autowired
	OffreRepository offreRepository;

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		offreRepository.save(new Offre("Web Design", "informatique", "AXA", 2, "France"));
		offreRepository.save(new Offre("Web Developper", "informatique", "AXA", 2, "France"));
		offreRepository.save(new Offre("Web Design", "informatique", "AXA", 2, "France"));

	}
}
