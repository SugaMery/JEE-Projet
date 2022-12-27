/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.exemple.test.soutnanceproject.dao;

import com.exemple.test.soutnanceproject.entities.*;
import java.util.List;

/**
 *
 * @author user
 */
public interface IEvaluationDAO {
    
    public List<Evaluation> ListEvaluation();
    public List<Personne> ListPersonnes();
    public List<Institut> ListInstituts();
    
    public void addEvaluation(Evaluation evaluation);
    public long addPersonne(Personne personne);
    
    public long addInstitut(Institut institut);
    
    
}
