/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakat.View.Amil;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import Zakat.Entity.Amil;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import Connection.ConnectionDB;
import java.sql.*;
import java.util.Arrays;
import Main.Main;
import javax.swing.Action;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author Jojon
 */
public class AmilViewController implements Initializable {

    @FXML
    private Button btnSimpan, btnBatal;
    @FXML
    private TextField txtAmil,txtNama,txtNohp;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private RadioButton rbBiasa, rbMaster;
    private int akses;
    
    private Main main;
  
    
    ConnectionDB CDB = new ConnectionDB();

    public AmilViewController() {
        this.akses = 1;
    }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void btnSimpanClickAction(){
        simpanDataAmil();
    }
    
    public void simpanDataAmil(){
        try{
        Statement st=CDB.getConnection().createStatement();
            int rs;
            rs = st.executeUpdate("Insert into amil values ('"
                    +txtAmil.getText()+"','"
                    +txtNama.getText()+"','"
                    +txtPassword.getText()+"','"
                    +txtNohp.getText()+"','"
                    +akses+"')"
            );
        System.out.println("Data Berhasil Di Simpan");
        KosongText();
        }catch(SQLException se){
            System.out.println("Data Gagal Di Simpan");
        }
    }
    public void KosongText(){
        txtAmil.setText("");
        txtNama.setText("");
        txtPassword.setText("");
        txtNohp.setText("");
        
    }
}
