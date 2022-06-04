package com.ajmoreid.pcguideapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ajmoreid.pcguideapi.entities.PcAssembly;
import com.ajmoreid.pcguideapi.repositories.PcAssemblyRepository;
import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PcGuideApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PcGuideApiApplication.class, args);
    }

    // call addPcAssembly API
//    @Bean
//    CommandLineRunner init(PcAssemblyRepository pcAssemblyRepository) {
//        return args -> {
//            Stream.of("Home & Office", "For Fun", "Gaming").forEach(computerType -> {
//                PcAssembly pcAssembly = new PcAssembly(computerType, "AMD", 1, 1, 1);
//                pcAssemblyRepository.save(pcAssembly);
//            });
//            pcAssemblyRepository.findAll().forEach(System.out::println);
//        };
//    }
}
