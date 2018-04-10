/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Wil
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField textField_AgregaFruta;
    private TextField textField_AgregaOperacion;
    private ComboBox comboBox_Fruta;
    private ComboBox comboBox_Operacion;
    
    @Override
    public void initialize( URL url, ResourceBundle rb) {
        // TODO
        Frutas manzana = Frutas.MANZANA;
        Frutas pera = Frutas.PERA;
        Frutas limon = Frutas.LIMON;
        Frutas melon = Frutas.MELON;
        Frutas naranja = Frutas.NARANJA;
        
     for (Frutas fruta : Frutas.values()){
         System.out.printf("", fruta, fruta.getTipoFruta());
     }
        
    }    
    
}
