package com.ezzahi.dao;

import com.ezzahi.models.Personne;

import java.util.List;

public interface IProduitDao {
    void save(Personne p);
    void remove(Long id);
    List<Personne> getAll();
    Personne getById(Long id);
    List<Personne> getByName(String name);
}
