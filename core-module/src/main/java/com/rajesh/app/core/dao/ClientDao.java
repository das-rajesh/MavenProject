/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajesh.app.core.dao;

import com.rajesh.app.core.entity.Client;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface ClientDao {
        List<Client> getAll() throws ClassNotFoundException,SQLException; 

}
