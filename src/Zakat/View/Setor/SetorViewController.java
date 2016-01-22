/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakat.View.Setor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import Zakat.Entity.AmilActive;
import Zakat.View.Login.LoginViewController;



public class SetorViewController extends AmilActive implements Initializable {

    @FXML
    private TextField txtNamaPenyetor, txtJmlKeluarga;
    @FXML
    private TextArea txtAlamat;
    @FXML
    RadioButton rbBeras = new RadioButton();
    @FXML
    RadioButton rbUang = new RadioButton();
    final ToggleGroup group = new ToggleGroup();
    AmilActive AA= new AmilActive();
    
    
    private String Amila; 
    public String getAmila() {
        return Amila;
    }

    public void setAmila(String Amila) {
        this.Amila = Amila;
    }
    
    @FXML
    Label lblIdAmil = new Label();
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblIdAmil.setText(getAmila());
    }
    
    
   
    
}
