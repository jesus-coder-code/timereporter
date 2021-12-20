package com.jesus.models;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.*;

@Entity
@Table(name = "empleados")
public class Employee {
    @Id
    @Column(name = "id")
    @NotNull
    private int id;

    @Column(name = "nombre")
    @NotNull
    private String nombre;

    @Column(name = "username")
    @NotNull
    private String username;

    @Column(name = "password")
    @NotNull
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleados")
    private List<Entry> entry;

    public Employee() {
    }

    public Employee(@NotNull int id, @NotNull String nombre, @NotNull String username, @NotNull String password) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
