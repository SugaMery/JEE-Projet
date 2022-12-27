/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author user
 */
@Entity
public class Memoire implements Serializable {

    @OneToOne(mappedBy = "memoire")
    private Resume resume;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=30)
    private String sujet;

    private String langue;

    @Temporal(TemporalType.DATE)
    private Date dateSoutenance;


    private String lieu;

    @Lob
    private byte[] pdf;

    @OneToOne
    @JoinColumn(name="ID_ETUDIANT", nullable=false)
    private Personne etudiant;

    public Long getId() {
        return id;
    }

    public Memoire() {
    }

    public Memoire(String sujet, String langue, Date dateSoutenance, String lieu, byte[] pdf, Personne etudiant) {
        this.sujet = sujet;
        this.langue = langue;
        this.dateSoutenance = dateSoutenance;
        this.lieu = lieu;
        this.pdf = pdf;
        this.etudiant = etudiant;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public Date getDateSoutenance() {
        return dateSoutenance;
    }

    public void setDateSoutenance(Date dateSoutenance) {
        this.dateSoutenance = dateSoutenance;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }

    public Personne getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Personne etudiant) {
        this.etudiant = etudiant;
    }





}