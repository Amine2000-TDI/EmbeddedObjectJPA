package com.ezzahi.dao;

import com.ezzahi.models.Personne;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class PersonneDao implements IProduitDao{
    private EntityManager session = null;
    private EntityTransaction tx = null;
    private static Logger log = LogManager.getLogger(PersonneDao.class);

    @Override
    public void save(Personne p) {
        try {
            session = SessionBuilder.getSessionBuilder().createEntityManager();
            tx = session.getTransaction();
            tx.begin();
            session.merge(p);
            tx.commit();
            log.info("save Personne OK "+p);
        }catch (Exception e){
            e.printStackTrace();
            log.error("erreur dans save()", e);
            tx.rollback();
        }finally {
            session.close();
        }
    }

    @Override
    public void remove(Long id) {
        try {
            session = SessionBuilder.getSessionBuilder().createEntityManager();
            tx = session.getTransaction();
            tx.begin();
            Personne p = session.find(Personne.class,id);
            if(p != null){
                session.remove(p);
            }
            tx.commit();
            log.info("remove Personne OK "+p);
        }catch (Exception e){
            e.printStackTrace();
            log.error("erreur dans remove()", e);
            tx.rollback();
        }finally {
            session.close();
        }
    }

    @Override
    public List<Personne> getAll() {
        try {
            session = SessionBuilder.getSessionBuilder().createEntityManager();
            var result = session.createQuery("from Personne").getResultList();
            log.info("getAll ok ");
            return result;
        }catch (Exception e){
            e.printStackTrace();
            log.error("erreur dans getALL()", e);
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public Personne getById(Long id) {
        try {
            session = SessionBuilder.getSessionBuilder().createEntityManager();
            Personne p = session.find(Personne.class,id);
            log.info("getById Personne OK "+p);
            return p;
        }catch (Exception e){
            e.printStackTrace();
            log.error("erreur dans getById()", e);
            return  null;
        }finally {
            session.close();
        }
    }

    @Override
    public List<Personne> getByName(String name) {
        try {
            session = SessionBuilder.getSessionBuilder().createEntityManager();
            Query query = session.createQuery("from Personne p where p.nom like :name");
            query.setParameter("name","%"+name+"%");
            var result = query.getResultList();
            log.info("getByName ok ");
            return result;
        }catch (Exception e){
            e.printStackTrace();
            log.error("erreur dans getByName()", e);
            return null;
        }finally {
            session.close();
        }
    }
}
