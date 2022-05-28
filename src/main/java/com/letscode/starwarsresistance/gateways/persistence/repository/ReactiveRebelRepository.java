package com.letscode.starwarsresistance.gateways.persistence.repository;

import com.letscode.starwarsresistance.domains.entities.Rebel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReactiveRebelRepository extends ReactiveCrudRepository<Rebel, Long> {
}
