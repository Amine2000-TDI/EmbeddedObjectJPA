package com.ezzahi.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SessionBuilder {
    private static EntityManagerFactory entityManagerFactory;
    private SessionBuilder(){}
    public static EntityManagerFactory getSessionBuilder(){
        if(entityManagerFactory == null){
            entityManagerFactory = Persistence.createEntityManagerFactory("mydb");
        }
        return entityManagerFactory;
    }
}
