
package laboratorio1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;



public class FXMLDocumentController implements Initializable {
    
    public static ObservableList<Frutas> listaFrutas = FXCollections.observableArrayList();
    
    @FXML
    private ComboBox comboBox_Fruta;
    @FXML
    private ComboBox comboBox_FrutaSuma;
    @FXML
    private Label label_Resultado;

    
    @Override
    public void initialize( URL url, ResourceBundle rb) {
       
        llenaListaFrutas();
        muestraComboBox();
       
    } 
     public void llenaListaFrutas (){
          listaFrutas.add(Frutas.MANZANA);
          listaFrutas.add(Frutas.PERA);
          listaFrutas.add(Frutas.LIMON);
          listaFrutas.add(Frutas.NARANJA);
          listaFrutas.add(Frutas.MELON);
      }
     
     private void muestraComboBox() {
         
             
         
    for (int i = 0; i <listaFrutas.size(); i++) {
    comboBox_Fruta.getItems().add(listaFrutas.get(i));
    comboBox_FrutaSuma.getItems().add(listaFrutas.get(i));
    
    }
    }
    @FXML
      private void button_Operacion(){
       
        if(comboBox_FrutaSuma.getValue().equals(Frutas.PERA) && comboBox_Fruta.getValue().equals(Frutas.PERA)){
            label_Resultado.setText(Frutas.PERA.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.PERA) && comboBox_Fruta.getValue().equals(Frutas.MANZANA)){
            label_Resultado.setText(Frutas.MELON.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.PERA) && comboBox_Fruta.getValue().equals(Frutas.LIMON)){
            label_Resultado.setText(Frutas.NARANJA.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.PERA)  && comboBox_Fruta.getValue().equals(Frutas.MELON)){
            label_Resultado.setText(Frutas.LIMON.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.PERA)  && comboBox_Fruta.getValue().equals(Frutas.NARANJA)){
            label_Resultado.setText(Frutas.MANZANA.toString());
        }
        
        if(comboBox_FrutaSuma.getValue().equals(Frutas.MANZANA) && comboBox_Fruta.equals(Frutas.PERA)){
             label_Resultado.setText(Frutas.MELON.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.MANZANA) && comboBox_Fruta.getValue().equals(Frutas.MANZANA)){
            label_Resultado.setText(Frutas.MANZANA.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.MANZANA) && comboBox_Fruta.getValue().equals(Frutas.LIMON)){
            label_Resultado.setText(Frutas.NARANJA.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.MANZANA) && comboBox_Fruta.getValue().equals(Frutas.MELON)){
           label_Resultado.setText(Frutas.LIMON.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.MANZANA) && comboBox_Fruta.getValue().equals(Frutas.NARANJA)){
            label_Resultado.setText(Frutas.PERA.toString());
        }
     
        if(comboBox_FrutaSuma.getValue().equals(Frutas.LIMON) && comboBox_Fruta.getValue().equals(Frutas.PERA)){
            label_Resultado.setText(Frutas.NARANJA.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.LIMON) && comboBox_Fruta.getValue().equals(Frutas.MANZANA)){
            label_Resultado.setText(Frutas.PERA.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.LIMON) && comboBox_Fruta.getValue().equals(Frutas.LIMON)){
            label_Resultado.setText(Frutas.LIMON.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.LIMON) && comboBox_Fruta.getValue().equals(Frutas.MELON)){
           label_Resultado.setText(Frutas.MANZANA.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.LIMON) && comboBox_Fruta.getValue().equals(Frutas.NARANJA)){
           label_Resultado.setText(Frutas.MELON.toString());
        }
    
        if(comboBox_FrutaSuma.getValue().equals(Frutas.MELON) && comboBox_Fruta.getValue().equals(Frutas.PERA)){
           label_Resultado.setText(Frutas.MANZANA.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.MELON) && comboBox_Fruta.equals(Frutas.MANZANA)){
            label_Resultado.setText(Frutas.PERA.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.MELON) && comboBox_Fruta.equals(Frutas.LIMON)){
           label_Resultado.setText(Frutas.NARANJA.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.MELON) && comboBox_Fruta.equals(Frutas.MELON)){
             label_Resultado.setText(Frutas.MELON.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.MELON) && comboBox_Fruta.equals(Frutas.NARANJA)){
            label_Resultado.setText(Frutas.LIMON.toString());
        }
     
        if(comboBox_FrutaSuma.getValue().equals(Frutas.NARANJA) && comboBox_Fruta.equals(Frutas.PERA)){
            label_Resultado.setText(Frutas.LIMON.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.NARANJA)&& comboBox_Fruta.equals(Frutas.MANZANA)){
             label_Resultado.setText(Frutas.MELON.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.NARANJA) && comboBox_Fruta.equals(Frutas.LIMON)){
            label_Resultado.setText(Frutas.PERA.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.NARANJA) && comboBox_Fruta.getValue().equals(Frutas.MANZANA)){
            label_Resultado.setText(Frutas.MANZANA.toString());
        }
        if(comboBox_FrutaSuma.getValue().equals(Frutas.NARANJA) && comboBox_Fruta.equals(Frutas.NARANJA)){
            label_Resultado.setText(Frutas.NARANJA.toString());
        }
     }
}   
    
