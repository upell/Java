/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakat.Entity;

public class Amil {
    private String Id, Nama, Password, NoHP;
    private int akses;
    
    public Amil(String Id, String Nama,String Password,String NoHP,int akses){
        this.Id = Id;
        this.Nama=Nama;
        this.Password = Password;
        this.NoHP=NoHP;
        this.akses=akses;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNoHP() {
        return NoHP;
    }

    public void setNoHP(String NoHP) {
        this.NoHP = NoHP;
    }

    public int getAkses() {
        return akses;
    }

    public void setAkses(int akses) {
        this.akses = akses;
    }
    
}
