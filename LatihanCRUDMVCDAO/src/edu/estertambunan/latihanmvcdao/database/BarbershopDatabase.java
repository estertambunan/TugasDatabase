/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.estertambunan.latihanmvcdao.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.estertambunan.latihanmvcdao.impl.PelangganDaoImpl;
import edu.estertambunan.latihanmvcdao.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class BarbershopDatabase {
    private static Connection connection;
    private static PelangganDao PelanganDao;
    
    public static Connection getConnection() throws SQLException{
        if (connection==null) {
            
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/barbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
            
    }
    public static PelangganDao getPelangganDao() throws SQLException{
        
        if (PelanganDao==null) {
            PelanganDao = new PelangganDaoImpl(getConnection());
        }
        return PelanganDao;
    }
    
}
