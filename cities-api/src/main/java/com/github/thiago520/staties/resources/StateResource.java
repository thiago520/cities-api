package com.github.thiago520.staties.resources;

import com.github.thiago520.staties.entities.State;
import com.github.thiago520.staties.repositories.StateRepository;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

  private final StateRepository repository;

  public StateResource(final StateRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public Page<State> staties(Pageable page) {
    return repository.findAll(page);
  }
}
