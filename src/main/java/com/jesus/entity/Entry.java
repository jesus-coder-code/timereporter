package com.jesus.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Temporal;


@Entity
@Table(name = "entradas")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "proyecto")
    private String proyecto;
    
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dia")
    private Date dia;

    @Column(name = "tiempo")
    private int tiempo;

    @Column(name = "notas")
    private String notas;

    @Column(name = "IdEmpleado")
    private int IdEmpleado;
    
    public Entry(){

    }

    public Entry(int id, String proyecto, Date dia, int tiempo, String notas, int idEmpleado) {
        this.id = id;
        this.proyecto = proyecto;
        this.dia = dia;
        this.tiempo = tiempo;
        this.notas = notas;
        IdEmpleado = idEmpleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        IdEmpleado = idEmpleado;
    }
    
}
