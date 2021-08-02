package com.cities.cities.estados;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue
    private BigInteger id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private Integer ibge;

    private Integer pais;

    
    private List<Integer> ddd;



}
