package com.proton.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.proton.models.entities.Endereco;
import com.proton.models.entities.Municipe;
import com.proton.models.repositories.EnderecoRepository;
import com.proton.models.repositories.MunicipeRepository;

import jakarta.transaction.Transactional;

@Transactional
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    MunicipeRepository municipeRepository;

    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
	public void run(String... args) throws Exception {
        
        /*
        Endereco endereco = new Endereco(null, "Residencial", "08541000", "Estrada",
        "Stella Mazzuca", "1611", "Casa", "Cháracara Laguna", "Ferraz de Vasconcelos", "SP", "Brasil");
        enderecoRepository.save(endereco);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse("01-01-2022", formatter);

        Municipe municipe = new Municipe(null, "Vagner", "vagner@gmail.com", "1234", "13432", date, endereco);
        
        
        municipeRepository.save(municipe);
     */
    }
    
}
