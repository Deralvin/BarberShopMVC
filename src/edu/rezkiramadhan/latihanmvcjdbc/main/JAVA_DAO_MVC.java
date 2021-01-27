/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rezkiramadhan.latihanmvcjdbc.main;

import edu.rezkiramadhan.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.rezkiramadhan.latihanmvcjdbc.entity.Pelanggan;
import edu.rezkiramadhan.latihanmvcjdbc.error.PelangganException;
import edu.rezkiramadhan.latihanmvcjdbc.service.PelangganDao;
import edu.rezkiramadhan.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author ENG-DEV23
 */
public class JAVA_DAO_MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                   MainViewPelanggan pelanggan = new MainViewPelanggan();
                   pelanggan.loadDatabase();
                   pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex){
                    Logger.getLogger(JAVA_DAO_MVC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
