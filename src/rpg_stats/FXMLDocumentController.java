package rpg_stats;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import rpg_stats.Dados;

public class FXMLDocumentController implements Initializable {
    
    Dados dado = new Dados();
    ArrayList<Integer> vazia = new ArrayList<Integer>(); 
    
    @FXML
    private TextField tf_d4;
    @FXML
    private TextField tf_d6;
    @FXML
    private TextField tf_d8;
    @FXML
    private TextField tf_d10;
    @FXML
    private TextField tf_d12;
    @FXML
    private TextField tf_d20;
    
    @FXML
    private Label label_number;
     @FXML
    private Label label_number1;
    @FXML
    private Label label_number2;
    @FXML
    private Label label_number3;
    @FXML
    private Label label_number4;
    @FXML
    private Label label_number5;
    
    @FXML
    private Label array_d4;
    @FXML
    private Label array_d6;
    @FXML
    private Label array_d8;
    @FXML
    private Label array_d10;
    @FXML
    private Label array_d12;
    @FXML
    private Label array_d20;
    
    @FXML
    private Label error_label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            label_number.setText(String.valueOf(dado.roll(4, Integer.parseInt(tf_d4.getText()))));
            array_d4.setText(dado.hist.toString()); dado.setHist(vazia);
            label_number1.setText(String.valueOf(dado.roll(6, Integer.parseInt(tf_d6.getText()))));
            array_d6.setText(dado.hist.toString()); dado.setHist(vazia);
            label_number2.setText(String.valueOf(dado.roll(8, Integer.parseInt(tf_d8.getText()))));
            array_d8.setText(dado.hist.toString()); dado.setHist(vazia);
            label_number3.setText(String.valueOf(dado.roll(10, Integer.parseInt(tf_d10.getText()))));
            array_d10.setText(dado.hist.toString()); dado.setHist(vazia);
            label_number4.setText(String.valueOf(dado.roll(12, Integer.parseInt(tf_d12.getText()))));
            array_d12.setText(dado.hist.toString()); dado.setHist(vazia);
            label_number5.setText(String.valueOf(dado.roll(20, Integer.parseInt(tf_d20.getText()))));
            array_d20.setText(dado.hist.toString()); dado.setHist(vazia);
        } catch (NumberFormatException e){
            error_label.setText("Only numbers, please");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }       
}
