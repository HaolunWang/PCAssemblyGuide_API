package com.ajmoreid.pcguideapi.controllers;

import com.ajmoreid.pcguideapi.entities.PcAssembly;
import com.ajmoreid.pcguideapi.repositories.PcAssemblyRepository;
import java.util.List;

import org.springframework.web.bind.annotation.*;

/**
 * Of course, the implementation detail worth noting here is the use of the @CrossOrigin annotation.
 * As the name implies, the annotation enables Cross-Origin Resource Sharing (CORS) on the server.
 * This step isn't always necessary, but since we're deploying our Angular frontend to http://localhost:4200,
 * and our Boot backend to http://localhost:8080, the browser would otherwise deny requests from one to the other.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PcAssemblyController {

    private final PcAssemblyRepository pcAssemblyRepository;

    public PcAssemblyController(PcAssemblyRepository pcAssemblyRepository) {
        this.pcAssemblyRepository = pcAssemblyRepository;
    }

    // only for test
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "Allen") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/allpcs")
    public List<PcAssembly> getAllPcsAssembly() {
        return (List<PcAssembly>) pcAssemblyRepository.findAll();
    }

    @PostMapping("/pcassembly")
    void addPcAssembly(@RequestBody PcAssembly pcAssembly) {
        pcAssemblyRepository.save(pcAssembly);
    }
}
