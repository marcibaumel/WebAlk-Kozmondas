package com.szorgalmi.kozmondas;

import com.szorgalmi.kozmondas.Entity.Proverb;
import com.szorgalmi.kozmondas.Services.ProverbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KozmondasApplication {

	public static void main(String[] args) {
		SpringApplication.run(KozmondasApplication.class, args);
	}

}
