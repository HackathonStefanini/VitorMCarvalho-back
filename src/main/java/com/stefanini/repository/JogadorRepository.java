package com.stefanini.repository;

import com.stefanini.dao.GenericDAO;
import com.stefanini.entity.Jogador;
import com.stefanini.exceptions.UsuarioException;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class JogadorRepository extends GenericDAO<Jogador, Long> {
    @Transactional
    public Jogador findByName(String name){
        try {
            return (Jogador) createNativeQuery("SELECT joga FROM Jogador_Stefamon joga WHERE joga.nickname = :name")
                    .setParameter("name", name).getSingleResult();
        }catch (UsuarioException e){
            return null;
        }
    }
}
