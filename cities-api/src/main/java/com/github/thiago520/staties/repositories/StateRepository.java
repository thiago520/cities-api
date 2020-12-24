package com.github.thiago520.staties.repositories;

import com.github.thiago520.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
