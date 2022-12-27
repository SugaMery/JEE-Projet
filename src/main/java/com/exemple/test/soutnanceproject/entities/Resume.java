/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

/**
 *
 * @author user
 */
@Entity
public class Resume implements Serializable {

    @EmbeddedId
    private ResumePk resumePk;
   

    @Column(length = 5000)
    private String resume;

    
  
    @MapsId("idMemoire")
    @OneToOne
    private Memoire memoire;

    public ResumePk getResumePk() {
        return resumePk;
        
        
    }

    public void setResumePk(ResumePk resumePk) {
        this.resumePk = resumePk;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Memoire getMemoire() {
        return memoire;
    }

    public void setMemoire(Memoire memoire) {
        this.memoire = memoire;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.resumePk);
        hash = 89 * hash + Objects.hashCode(this.resume);
        hash = 89 * hash + Objects.hashCode(this.memoire);
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
        final Resume other = (Resume) obj;
        if (!Objects.equals(this.resume, other.resume)) {
            return false;
        }
        if (!Objects.equals(this.resumePk, other.resumePk)) {
            return false;
        }
        return Objects.equals(this.memoire, other.memoire);
    }

   

}