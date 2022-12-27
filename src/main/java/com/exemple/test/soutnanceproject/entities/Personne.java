/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
/**
 *
 * @author user
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Personne.findAll", query = "SELECT p FROM Personne p")
})
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    private String prenom;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String lieuNaissance;
    @Column(nullable=true)
    private String emailPerso;
    private String emailPro;

    //@Transient
    @Column(nullable=true)
    private int age;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnregistrement;

    @OneToOne(mappedBy = "etudiant")
    private Memoire memoire;


    public Personne(String nom,String prenom,String emailPro){
        this.nom=nom;
        this.prenom=prenom;
        this.emailPro=emailPro;
    }


    public Personne(){

    }






    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }



    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getEmailPerso() {
        return emailPerso;
    }

    public void setEmailPerso(String emailPerso) {
        this.emailPerso = emailPerso;
    }

    public String getEmailPro() {
        return emailPro;
    }

    public void setEmailPro(String emailPro) {
        this.emailPro = emailPro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.nom);
        hash = 71 * hash + Objects.hashCode(this.dateNaissance);
        hash = 71 * hash + Objects.hashCode(this.lieuNaissance);
        hash = 71 * hash + Objects.hashCode(this.emailPerso);
        hash = 71 * hash + Objects.hashCode(this.emailPro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personne other = (Personne) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.lieuNaissance, other.lieuNaissance)) {
            return false;
        }
        if (!Objects.equals(this.emailPerso, other.emailPerso)) {
            return false;
        }
        if (!Objects.equals(this.emailPro, other.emailPro)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.dateNaissance, other.dateNaissance);
    }


    @PrePersist
    public void avantEnregistrement(){
        dateEnregistrement = new Date();

    }
}