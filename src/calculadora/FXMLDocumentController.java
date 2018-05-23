/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author ftlor
 */
public class FXMLDocumentController implements Initializable {
    
    private double valor = 0;
    private Integer operador = -1;
    private boolean btigual = false;
    private boolean btponto = false;
    
    @FXML
    private Button oito;

    @FXML
    private Button ponto;

    @FXML
    private Button limpa;

    @FXML
    private Button nove;

    @FXML
    private Button quatro;

    @FXML
    private Button seis;

    @FXML
    private Button mais;

    @FXML
    private Button cinco;

    @FXML
    private Button zero;

    @FXML
    private TextField visor;

    @FXML
    private Button porcento;

    @FXML
    private Button menos;

    @FXML
    private Button sete;

    @FXML
    private Button um;

    @FXML
    private Button divide;

    @FXML
    private Button igual;

    @FXML
    private Button tres;

    @FXML
    private Button dois;

    @FXML
    private Button veses;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource() == um){
            if(btigual == false){
                visor.setText(visor.getText() + "1");  
            } else {
                visor.setText("");
                btigual = false;
                visor.setText(visor.getText() + "1");
            }
        } else if(event.getSource() == dois){
            if(btigual == false){
                visor.setText(visor.getText() + "2");
            } else {
                visor.setText("");
                btigual = false;
                visor.setText(visor.getText() + "2");
            }
        } else if(event.getSource() == tres){
            if(btigual == false){
                visor.setText(visor.getText() + "3");
            } else {
                visor.setText("");
                btigual = false;
                visor.setText(visor.getText() + "3");
            }
        } else if(event.getSource() == quatro){
            if(btigual == false){
                visor.setText(visor.getText() + "4");
            } else {
                visor.setText("");
                btigual = false;
                visor.setText(visor.getText() + "4");
            }
        } else if(event.getSource() == cinco){
            if(btigual == false){
                visor.setText(visor.getText() + "5");
            } else {
                visor.setText("");
                btigual = false;
                visor.setText(visor.getText() + "5");
            }
        } else if(event.getSource() == seis){
            if(btigual == false){
                visor.setText(visor.getText() + "6");
            } else {
                visor.setText("");
                btigual = false;
                visor.setText(visor.getText() + "6");
            }
        } else if(event.getSource() == sete){
            if(btigual == false){
                visor.setText(visor.getText() + "7");
            } else {
                visor.setText("");
                btigual = false;
                visor.setText(visor.getText() + "7");
            }
        } else if(event.getSource() == oito){
            if(btigual == false){
                visor.setText(visor.getText() + "8");
            } else {
                visor.setText("");
                btigual = false;
                visor.setText(visor.getText() + "8");
            }
        } else if(event.getSource() == nove){
            if(btigual == false){
                visor.setText(visor.getText() + "9");
            } else {
                visor.setText("");
                btigual = false;
                visor.setText(visor.getText() + "9");
            }
        } else if(event.getSource() == zero){
            if(btigual == false){
                visor.setText(visor.getText() + "0");
            } else {
                visor.setText("");
                btigual = false;
                visor.setText(visor.getText() + "0");
            }
        } else if(event.getSource() == ponto){
            visor.setText(visor.getText() + ".");
        } else if(event.getSource() == limpa){
            visor.setText("");
            valor = 0;
        } else if(event.getSource() == mais)
        {
            valor = Double.parseDouble(visor.getText());
            operador = 1; //SOMA
            visor.setText("");
        } else if(event.getSource() == menos)
        {
            valor = Double.parseDouble(visor.getText());
            operador = 2; //DIMINUI
            visor.setText("");
        } else if(event.getSource() == divide)
        {
            valor = Double.parseDouble(visor.getText());
            operador = 3; //DIVISOR
            visor.setText("");
        } else if(event.getSource() == veses)
        {
            valor = Double.parseDouble(visor.getText());
            operador = 4; //MULTIPLICADOR
            visor.setText("");
        } else if(event.getSource() == porcento)
        {
            valor = Double.parseDouble(visor.getText());
            operador = 5; //PORCENTAGEM
            visor.setText("");
        } else if(event.getSource() == igual && btigual == false)
        {
            double operador2 = Double.parseDouble(visor.getText());
            switch(operador)
            {
                case 1: //SOMA
                    double resultado = valor + operador2;
                    visor.setText(String.valueOf(resultado));
                    btigual = true;
                    resultado = 0;
                    valor = 0;
                    break;
                case 2: //DIMINUI
                    resultado = valor - operador2;
                    visor.setText(String.valueOf(resultado));
                    btigual = true;
                    resultado = 0;
                    valor = 0;
                    break;
                case 3: //DIVISOR
                    resultado = 0f;
                    try {
                        resultado = valor / operador2;
                    }catch(Exception e){
                        visor.setText("Error");
                    }
                    visor.setText(String.valueOf(resultado));
                    btigual = true;
                    resultado = 0;
                    valor = 0;
                    break;
                case 4: //MULTIPLICADOR
                    resultado = valor * operador2;
                    visor.setText(String.valueOf(resultado));
                    btigual = true;
                    resultado = 0;
                    valor = 0;
                    break;
                case 5: //PORCENTAGEM
                    resultado = valor % operador2;
                    visor.setText(String.valueOf(resultado));
                    btigual = true;
                    resultado = 0;
                    valor = 0;
                    break;
            }
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
