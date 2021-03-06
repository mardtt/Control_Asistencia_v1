/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enap.dao;

import com.enap.modelo.Usuario;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Marco.ENAP
 */
@Stateful
public class UsuarioDao extends FabricaDao<Usuario> {

    @PersistenceContext(unitName = "ControlAsistenciaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioDao() {
        super(Usuario.class);
    }    

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }    
    
    
}
