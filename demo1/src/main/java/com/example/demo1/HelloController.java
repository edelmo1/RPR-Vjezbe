package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField text;
    private String trenutniBroj="";
    private String prviBroj="";
    private String prethodniBrojevi="";
    private String vrstaOperacije="";
    public void dodaj(String broj){
        trenutniBroj+=broj;
        updateText();
    }
    public void updateText(){text.setText(trenutniBroj);}

    @FXML

    public void brojJedan(ActionEvent actionEvent) {dodaj("1");}

    public void postavi(String vrstaOperacije){

        this.vrstaOperacije=vrstaOperacije;
        prviBroj=trenutniBroj;
        trenutniBroj="";
        prethodniBrojevi=prviBroj+" "+vrstaOperacije;
        text.setText(prethodniBrojevi);
    }
    @FXML
    public void plus(ActionEvent actionEvent){postavi("+");}
    @FXML
    public void postotak(ActionEvent actionEvent){postavi("%");}
    @FXML
    public void dijeljenje(ActionEvent actionEvent){postavi("/");}
    @FXML
    public void mnozenje(ActionEvent actionEvent){postavi("x");}
    @FXML
    public void oduzimanje(ActionEvent actionEvent){postavi("-");}
    @FXML
    public void sabiranje(ActionEvent actionEvent){postavi("+");}
    @FXML
    public void button7Clicked(ActionEvent actionEvent){dodaj("7");}
    @FXML
    public void button8Clicked(ActionEvent actionEvent){dodaj("8");}
    @FXML
    public void button9Clicked(ActionEvent actionEvent){dodaj("9");}
    @FXML
    public void button4Clicked(ActionEvent actionEvent){dodaj("4");}
    @FXML
    public void button5Clicked(ActionEvent actionEvent){dodaj("5");}
    @FXML
    public void button6Clicked(ActionEvent actionEvent){dodaj("6");}
    @FXML
    public void button1Clicked(ActionEvent actionEvent){dodaj("1");}
    @FXML
    public void button2Clicked(ActionEvent actionEvent){dodaj("2");}
    @FXML
    public void button3Clicked(ActionEvent actionEvent){dodaj("3");}
    @FXML
    public void button0Clicked(ActionEvent actionEvent){if(!trenutniBroj.equals(""))dodaj("0");}
    @FXML
    public void zarez(ActionEvent actionEvent){postavi(",");}
    @FXML
    public void jednako(ActionEvent actionEvent){

        int prviBrojInt=Integer.parseInt(prviBroj);
        int drugiBrojInt=Integer.parseInt(trenutniBroj);
        if(vrstaOperacije=="+"){
            int rez=prviBrojInt+drugiBrojInt;
            prethodniBrojevi=(prviBroj+" + "+trenutniBroj+" = "+rez);
            text.setText(prethodniBrojevi);
        }
        else if(vrstaOperacije=="-"){
            int rez=prviBrojInt-drugiBrojInt;
            prethodniBrojevi=(prviBroj+" + "+trenutniBroj+" = "+rez);
            text.setText(prethodniBrojevi);
        }
        else if(vrstaOperacije=="x"){
            int rez=prviBrojInt*drugiBrojInt;
            prethodniBrojevi=(prviBroj+" + "+trenutniBroj+" = "+rez);
            text.setText(prethodniBrojevi);
        }
        else if(vrstaOperacije=="/"){
            int rez=prviBrojInt/drugiBrojInt;
            prethodniBrojevi=(prviBroj+" + "+trenutniBroj+" = "+rez);
            text.setText(prethodniBrojevi);
        }
        else if(vrstaOperacije=="%"){
            int rez=prviBrojInt%drugiBrojInt;
            prethodniBrojevi=(prviBroj+" + "+trenutniBroj+" = "+rez);
            text.setText(prethodniBrojevi);
        }
    }
















}