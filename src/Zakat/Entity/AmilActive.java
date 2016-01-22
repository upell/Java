/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakat.Entity;

import java.sql.Date;

/**
 *
 * @author Jojon
 */
public class AmilActive {
    
    public AmilActive(String Id, String Tanggal){
        this.Id = Id;
        this.tanggal = Tanggal;
    }

    public AmilActive() {
        
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    private String Id;
    private String tanggal;
    
    
    
}
