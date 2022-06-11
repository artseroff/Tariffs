package ru.rsreu.serov.tariffs.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "{valid.tariff.name.empty}")
    private String name;

    private String info;

   /* @OneToMany(cascade=CascadeType.REMOVE, mappedBy = "company")
    private List<Tariff> tariffList;*/

    public Company(Long id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public Company(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public Company(Long id) {
        this.id = id;
    }

    public Company() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}