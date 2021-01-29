/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadalvin.latihanmvcjdbc.event;

import edu.muhammadalvin.latihanmvcjdbc.entity.Pelanggan;
import edu.muhammadalvin.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author EMuhammadALvin
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);    
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);

}
