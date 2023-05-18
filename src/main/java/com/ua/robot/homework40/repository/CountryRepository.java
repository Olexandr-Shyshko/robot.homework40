package com.ua.robot.homework40.repository;

import com.ua.robot.homework40.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Integer> {
}
