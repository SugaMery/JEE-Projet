/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 *
 * @author user
 */
@Embeddable
public class MotClePk implements Serializable {

    //les deux sont les pk
    private String mot;
    private ResumePk resumePk;

    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public ResumePk getResumePk() {
        return resumePk;
    }

    public void setResumePk(ResumePk resumePk) {
        this.resumePk = resumePk;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.mot);
        hash = 97 * hash + Objects.hashCode(this.resumePk);
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
        final MotClePk other = (MotClePk) obj;
        if (!Objects.equals(this.mot, other.mot)) {
            return false;
        }
        return Objects.equals(this.resumePk, other.resumePk);
    }



}
