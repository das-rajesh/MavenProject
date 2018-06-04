/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajesh.app.core;

import com.rajesh.app.core.dao.ClientDao;
import com.rajesh.app.core.entity.Client;
import com.rajesh.app.core.impl.ClienDaoImpl;
import com.rajesh.app.core.service.ClientService;
import com.rajesh.app.core.service.impl.ClientServiceImpl;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class Program {
    public static void main(String[] args)  {
        ClientService clientService=new ClientServiceImpl(new ClienDaoImpl());
        try {
            for(Client c:clientService.getAll()){
              
                System.out.println("name " +c.getName());
            } for(Client c:clientService.getAll()){
              
                System.out.println("name " +c.getName());
            } for(Client c:clientService.getAll()){
              
                System.out.println("name " +c.getName());
            } for(Client c:clientService.getAll()){
              
                System.out.println("name " +c.getName());
            } for(Client c:clientService.getAll()){
              
                System.out.println("name " +c.getName());
            }
        } catch (SQLException | ClassNotFoundException ex) {
            
            System.out.println(ex.getMessage());
        }
    }
    
}
