/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.estertambunan.latihanmvcdao.event;

import edu.estertambunan.latihanmvcdao.entity.Pelanggan;
import edu.estertambunan.latihanmvcdao.model.PelangganModel;

/**
 *
 * @author Ester Tambunan
 * 10116466
 * PBO-11
 */
public interface PelangganListener {
    //parameter dari model pelanggan
    public void onChange(PelangganModel model);
    
    //parameter dari entity databases pelanggan
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    
    //karna tidak perlu menambahkan data ke dalam tabel,
    //jadi ondelete tidak perlu memasukkan data 
    // alias tidak perlu memakai parameter
    public void onDelete();


}
