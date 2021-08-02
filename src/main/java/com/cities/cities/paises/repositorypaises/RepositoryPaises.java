package com.cities.cities.paises.repositorypaises;

import com.cities.cities.paises.Paises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface RepositoryPaises extends JpaRepository<Paises, BigInteger> {
}
