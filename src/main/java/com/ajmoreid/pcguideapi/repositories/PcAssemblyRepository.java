package com.ajmoreid.pcguideapi.repositories;

import com.ajmoreid.pcguideapi.entities.PcAssembly;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface PcAssemblyRepository extends CrudRepository<PcAssembly, Long>{
}
