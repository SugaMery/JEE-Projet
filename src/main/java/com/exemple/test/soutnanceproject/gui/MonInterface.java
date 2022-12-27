/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemple.test.soutnanceproject.gui;

import com.exemple.test.soutnanceproject.entities.Institut;
import com.exemple.test.soutnanceproject.entities.Personne;
import com.exemple.test.soutnanceproject.services.EvaluationServicesImpl;
import com.exemple.test.soutnanceproject.services.IEvaluationServices;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MonInterface {
    static IEvaluationServices personnes = new EvaluationServicesImpl();
    static IEvaluationServices institus = new EvaluationServicesImpl();


    public static void listePerson(){
        //System.out.println("Il y'a "+personnes.ListPersonnes().size()+" dans la base:");
        for(Personne a : personnes.ListPersonnes()){
            System.out.println("\t\t"+a.getNom()+" "+ a.getPrenom()+" "+a.getEmailPro());
        }
    }

    public static void listeInstituts(){
        if(institus.ListInstituts().size()==0)
            System.out.println("\n\t\tLa liste des instituts est vide");
        else{
            for (Institut i : institus.ListInstituts()) {
                System.out.println("\t\t" + i.getNom() + "," + i.getAdresse());
            }
        }

    }

    public static void ajoutPerson(){
        Scanner in = new Scanner(System.in);
        System.out.print("Entrer le nom: ");
        String nom = in.nextLine();
        System.out.print("Entrer le prenom: ");
        String prenom = in.nextLine();
        System.out.print("Entrer le mail pro: ");
        String mail = in.nextLine();
        Personne person = new Personne(nom,prenom,mail);
        System.out.print(personnes.addPersonne(person));

    }

    public static void ajoutInstitut(){
        Scanner in = new Scanner(System.in);
        System.out.print("Entrer le nom: ");
        String nom = in.nextLine();
        System.out.print("Entrer l'adresse: ");
        String adresse = in.nextLine();

        Institut inst = new Institut(nom,adresse);
        institus.addInstitut(inst);
    }

    public static void main(String[] args) {

        boolean q = true;
        System.out.println("1. Liste des personnes\n2.Ajouter une nouvelle personne\n3.Liste des institus\n4.Ajouter une nouvelle institut");
        System.out.println("Choix: ");
        Scanner out = new Scanner(System.in);
        int choix = Integer.parseInt( out.nextLine());

        while (choix<5) {


            switch (choix) {
                case 1:
                    listePerson();
                    break;
                case 2:
                    ajoutPerson();
                    break;
                case 3:
                    listeInstituts();
                    break;
                case 4:
                    ajoutInstitut();
                    break;

                default:
                    System.out.println("--------------------Fin du programme------------------------");
                    break;


            }
            System.out.println("1. Liste des personnes\n2.Ajouter une nouvelle personne\n3.Liste des institus\n4.Ajouter une nouvelle institut");
            System.out.println("Choix: ");
            choix = Integer.parseInt(out.nextLine());
        }






    }

}
