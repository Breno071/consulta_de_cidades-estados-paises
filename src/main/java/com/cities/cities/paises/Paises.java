package com.cities.cities.paises;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "pais")
public class Paises {

    @Id
    @GeneratedValue
    private BigInteger id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String pt;

    @Column(name = "sigla")
    private String sigla;

    private Integer bacen;

    public Paises(BigInteger id, String name, String pt, String sigla, Integer bacen) {
        this.id = id;
        this.name = name;
        this.pt = pt;
        this.sigla = sigla;
        this.bacen = bacen;
    }

    public Paises() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getBacen() {
        return bacen;
    }

    public void setBacen(Integer bacen) {
        this.bacen = bacen;
    }
}
