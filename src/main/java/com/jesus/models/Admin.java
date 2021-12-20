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
@Table(name = "administrador")
public class Admin {
    @Id
    @Column(name = "id")
    @NotNull
    private int id;

    @Column(name = "nombre")
    @NotNull
    private String nombre;

    @NotNull
    @Column(name = "username")
    private String username;

    @NotNull
    @Column(name = "password")
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "administrador")
    private List<Project> projects;

    public Admin() {
    }

    public Admin(@NotNull int id, @NotNull String nombre, @NotNull String username, @NotNull String password) {
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
