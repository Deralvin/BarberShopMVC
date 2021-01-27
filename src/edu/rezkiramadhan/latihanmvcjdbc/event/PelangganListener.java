/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rezkiramadhan.latihanmvcjdbc.event;

import edu.rezkiramadhan.latihanmvcjdbc.entity.Pelanggan;
import edu.rezkiramadhan.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author ENG-DEV23
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);    
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);

}
