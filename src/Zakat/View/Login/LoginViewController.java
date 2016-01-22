/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakat.View.Login;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import Connection.ConnectionDB;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import Zakat.Entity.AmilActive;
import Zakat.View.Setor.SetorViewController;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jojon
 */
public class LoginViewController implements Initializable {

    @FXML
    private TextField txtIdAmil;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Label lblMessageIdAmil, lblPassword;
    ConnectionDB CDB = new ConnectionDB();
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    SetorViewController SVC = new SetorViewController();
    
    /*AmilActive AA = new AmilActive();

    private String AMILA;
    public String getAMILA() {
        return AA.getId();
    }

    public void setAMILA(String AMILA) {
        this.AMILA= AMILA;
    }*/
    
    

      
    
    @Override    
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    
    public void prosesLogin(ActionEvent event) throws IOException{
        try {
            Statement st= CDB.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from amil where id_amil='"+txtIdAmil.getText()+"'");
            if(rs.next()){
                if(txtPassword.getText().equals(rs.getString("password"))){
                    ((Node) (event.getSource())).getScene().getWindow().hide();
                    Stage stage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("/Zakat/View/Setor/SetorView.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    SVC.setAmila(txtIdAmil.getText());
                    JOptionPane.showMessageDialog(null, "NAma " +SVC.getAmila());
                    

                }else{
                    JOptionPane.showMessageDialog(null, "Password Salah !!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Username / Password Salah !!");
            }

        } catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Data Salah !! Pastikan Anda Memasukkan Data Dengan Benar");
        }
    }
        
    
}
