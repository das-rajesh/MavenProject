/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajesh.app.core.service.impl;

import com.rajesh.app.core.dao.ClientDao;
import com.rajesh.app.core.entity.Client;
import com.rajesh.app.core.impl.ClienDaoImpl;
import com.rajesh.app.core.service.ClientService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ClientServiceImpl implements ClientService{

    private ClientDao clientDao;
    private List<Client> clients;

    public ClientServiceImpl(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public List<Client> getAll() throws ClassNotFoundException, SQLException {
           
        if(clients==null){
            clients=clientDao.getAll();
        }
        
          return clients;
    }
    
}
