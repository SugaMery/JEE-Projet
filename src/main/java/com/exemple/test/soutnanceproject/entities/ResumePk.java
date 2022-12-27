/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Embeddable
public class ResumePk implements Serializable {


    private String codeLangue;
    private long idMemoire;

    public String getCodeLangue() {
        return codeLangue;
    }

    public void setCodeLangue(String codeLangue) {
        this.codeLangue = codeLangue;
    }

    public long getIdMemoire() {
        return idMemoire;
    }

    public void setIdMemoire(long idMemoire) {
        this.idMemoire = idMemoire;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.codeLangue);
        hash = 17 * hash + (int) (this.idMemoire ^ (this.idMemoire >>> 32));
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
        final ResumePk other = (ResumePk) obj;
        if (this.idMemoire != other.idMemoire) {
            return false;
        }
        return Objects.equals(this.codeLangue, other.codeLangue);
    }


}
