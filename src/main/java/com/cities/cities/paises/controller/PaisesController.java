package com.cities.cities.paises.controller;

import com.cities.cities.paises.Paises;
import com.cities.cities.paises.repositorypaises.RepositoryPaises;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Optional;

@RestController
@RequestMapping("/paises")
public class PaisesController {

    @Autowired
    RepositoryPaises repositoryPaises;

    @GetMapping
    public Page<Paises> getAllPaises(Pageable pageable){

        return repositoryPaises.findAll(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paises> getPais(@PathVariable BigInteger id){
        Optional<Paises> optional = repositoryPaises.findById(id);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
