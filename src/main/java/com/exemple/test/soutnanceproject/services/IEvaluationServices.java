/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.services;

import com.exemple.test.soutnanceproject.entities.*;
import java.util.List;

/**
 *
 * @author user
 */
public interface IEvaluationServices {
    
    public List<Evaluation> ListEvaluation();
    public List<Personne> ListPersonnes();
    public List<Institut> ListInstituts();
    
    
    public void addEvaluation(Evaluation evaluation);
    public long addPersonne(Personne personne);
    public long addInstitut(Institut institut);
    
}
