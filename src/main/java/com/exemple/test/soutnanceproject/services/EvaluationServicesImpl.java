/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.services;

import com.exemple.test.soutnanceproject.dao.EvaluationDAOImpl;
import com.exemple.test.soutnanceproject.dao.IEvaluationDAO;
import com.exemple.test.soutnanceproject.entities.Evaluation;
import com.exemple.test.soutnanceproject.entities.Institut;
import com.exemple.test.soutnanceproject.entities.Personne;
import java.util.List;

/**
 *
 * @author user
 */
public class EvaluationServicesImpl implements IEvaluationServices{
    IEvaluationDAO listEvaluations = new EvaluationDAOImpl();
    IEvaluationDAO listInstituts = new EvaluationDAOImpl();
    IEvaluationDAO listPersonnes = new EvaluationDAOImpl();

    @Override
    public List<Evaluation> ListEvaluation() {     
        
        return listEvaluations.ListEvaluation();
    } 

    @Override
    public List<Personne> ListPersonnes() {
        return listPersonnes.ListPersonnes();

    }

    @Override
    public void addEvaluation(Evaluation evaluation) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public long addPersonne(Personne personne) {
        IEvaluationDAO pers = new EvaluationDAOImpl();
        return pers.addPersonne(personne);
    }

    @Override
    public List<Institut> ListInstituts() {
       return listInstituts.ListInstituts();   
    }

    @Override
    public long addInstitut(Institut institut) {
        
        return listInstituts.addInstitut(institut);
    }
}
