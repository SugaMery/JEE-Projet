/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

/**
 *
 * @author user
 */
@Entity
public class MotCle implements Serializable {


    @EmbeddedId //permet de créer des ID composés
    private MotClePk motClePK;



    @ManyToOne
    @MapsId("resumePk")
    private Resume resume;

    public MotClePk getMotClePK() {
        return motClePK;
    }

    public void setMotClePK(MotClePk motClePK) {
        this.motClePK = motClePK;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.motClePK);
        hash = 79 * hash + Objects.hashCode(this.resume);
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
        final MotCle other = (MotCle) obj;
        if (!Objects.equals(this.motClePK, other.motClePK)) {
            return false;
        }
        return Objects.equals(this.resume, other.resume);
    }






}