/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class DbConfig {

    private static DbConfig instance;

    private final EntityManager em;

    public EntityManager getEm() {
        return em;
    }



    private DbConfig(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbPU");
        em = emf.createEntityManager();

    }

    public static DbConfig getInstance() {
        if(instance == null)
            instance = new DbConfig();
        return instance;
    }

}
