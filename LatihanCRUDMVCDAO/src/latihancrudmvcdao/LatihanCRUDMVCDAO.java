/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.estertambunan.latihanmvcdao.main;

import edu.estertambunan.latihanmvcdao.database.BarbershopDatabase;
import edu.estertambunan.latihanmvcdao.entity.Pelanggan;
import edu.estertambunan.latihanmvcdao.error.PelangganException;
import edu.estertambunan.latihanmvcdao.service.PelangganDao;
import edu.estertambunan.latihanmvcdao.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author user
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws edu.estertambunan.latihanmvcdao.error.PelangganException
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               try {
                   MainViewPelanggan pelanggan = new MainViewPelanggan();
                   pelanggan.loadDatabase();
                   pelanggan.setVisible(true);
               } catch(PelangganException ex) {
                   Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE,null, ex);
                   
               }
           }
       });
        
        
    }
    
}
