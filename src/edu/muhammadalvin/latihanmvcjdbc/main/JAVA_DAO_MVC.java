/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadalvin.latihanmvcjdbc.main;

import edu.muhammadalvin.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.muhammadalvin.latihanmvcjdbc.entity.Pelanggan;
import edu.muhammadalvin.latihanmvcjdbc.error.PelangganException;
import edu.muhammadalvin.latihanmvcjdbc.service.PelangganDao;
import edu.muhammadalvin.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author EMuhammadALvin
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
