/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.dao;

import com.exemple.test.soutnanceproject.config.DbConfig;
import com.exemple.test.soutnanceproject.entities.Evaluation;
import com.exemple.test.soutnanceproject.entities.Institut;
import com.exemple.test.soutnanceproject.entities.Personne;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author user
 */
public class EvaluationDAOImpl implements IEvaluationDAO {

    @Override
    public List<Evaluation> ListEvaluation() {
           
        EntityManager em = DbConfig.getInstance().getEm();     
        Query q = em.createNamedQuery("Evaluation.findAll");
        return q.getResultList();

    }

    @Override
    public List<Personne> ListPersonnes() {
        
        EntityManager em = DbConfig.getInstance().getEm();     
        Query q = em.createNamedQuery("Personne.findAll");
        List results = q.getResultList(); 
        //System.out.println(results);
        return results;
    }

    @Override
    public void addEvaluation(Evaluation evaluation) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public long addPersonne(Personne personne) {
        EntityManager em = DbConfig.getInstance().getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(personne);
        tx.commit();
        //em.close();
        return personne.getId();
    }

    @Override
    public List<Institut> ListInstituts() {
        EntityManager em = DbConfig.getInstance().getEm();     
        Query q = em.createNamedQuery("Institut.findAll");
        List results = q.getResultList(); 
        //System.out.println(results);
        return results;
    }

    @Override
    public long addInstitut(Institut institut) {
        EntityManager em = DbConfig.getInstance().getEm();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(institut);
        tx.commit();
        //em.close();
        return institut.getId();
    }
    
}
