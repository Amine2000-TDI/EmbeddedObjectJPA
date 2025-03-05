package com.ezzahi;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            System.out.println("Connexion réussie à la base de données !");
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Erreur de connexion à la base de données : " + e.getMessage());
        } finally {
            emf.close();
        }
    }
}