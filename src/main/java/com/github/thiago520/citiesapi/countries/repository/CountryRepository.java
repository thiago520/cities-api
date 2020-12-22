package com.github.thiago520.citiesapi.countries.repository;

import com.github.thiago520.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
