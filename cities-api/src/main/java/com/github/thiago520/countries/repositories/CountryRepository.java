package com.github.thiago520.countries.repositories;

import com.github.thiago520.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
