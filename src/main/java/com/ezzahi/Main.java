package com.ezzahi;


import com.ezzahi.dao.IProduitDao;
import com.ezzahi.dao.PersonneDao;
import com.ezzahi.models.Adresse;
import com.ezzahi.models.Personne;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IProduitDao dao = new PersonneDao();

        System.out.println("********************************* ADD 4 PERSONE ************************************");

//        dao.save(Personne.builder().
//                nom("Zarbaiu").
//                prenom("Amine").
//                adresse(Adresse.builder().street("al qods").city("Tanger").zipCode("10000").build()).
//                build());
//        dao.save(Personne.builder().
//                nom("Samiri").
//                prenom("Marouane").
//                adresse(Adresse.builder().street("El Oulfa").city("Casa").zipCode("130000").build()).
//                build());
//        dao.save(Personne.builder().
//                nom("Alami").
//                prenom("Mohamed").
//                adresse(Adresse.builder().street("Al farah").city("Rabat").zipCode("10000").build()).
//                build());
//        dao.save(Personne.builder().
//                nom("Ahmadi").
//                prenom("Samir").
//                adresse(Adresse.builder().street("Tetouan").city("Casa").zipCode("130000").build()).
//                build());

        System.out.println("********************************* GET ALL PERSONS ************************************");
        dao.getAll().forEach(System.out::println);
        System.out.println("************************************ REMOVE PERSONE WITH ID = 5 *********************************");
        dao.remove(5L);
        dao.getAll().forEach(System.out::println);
        System.out.println("********************************* GET PERSON WITH ID 6 ************************************");
        System.out.println(dao.getById(6L));
        System.out.println("********************************* GET PERSONS WITH NAME CONTAINE AM ************************************");
        dao.getByName("am").forEach(System.out::println);
    }
}