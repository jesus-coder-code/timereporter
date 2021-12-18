package com.jesus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proyectos")
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "IdAdmin")
    private int IdAdmin;
    

    public Projects() {
    }

    public Projects(int id, String nombre, int idAdmin) {
        this.id = id;
        this.nombre = nombre;
        IdAdmin = idAdmin;
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

    public int getIdAdmin() {
        return IdAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        IdAdmin = idAdmin;
    }
    
}
