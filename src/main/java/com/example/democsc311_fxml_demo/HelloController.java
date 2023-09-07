package com.example.democsc311_fxml_demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    public void calculate_Interest(){

    }
    @FXML
    private Button btn2;
    @FXML
    private Label welcomeText;

    @FXML
    private TextField rate;
    @FXML
    private TextField years;
    @FXML
    private TextField loanAmt;
    @FXML
    private TextField monthlyPay;
    @FXML
    private TextField totalPayed;


    @FXML

    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    int rateInput;
    int yearsInput;
    int loanAmtInput;
    int monthlyPayInput;
    int totalPayedInput;
    public void onCalculateButtonClick(ActionEvent actionEvent) {
        /*
        int rateInput = Integer.parseInt(rate.getText());
        int yearsInput = Integer.parseInt(years.getText());
        int loanAmtInput = Integer.parseInt(loanAmt.getText());
        int monthlyPayInput = Integer.parseInt(monthlyPay.getText());
        int totalPayedInput = Integer.parseInt(totalPayed.getText());
        int x = rateInput + yearsInput + loanAmtInput + monthlyPayInput + totalPayedInput;
        welcomeText.setText(String.valueOf(x));

         */


    }

    public void onBtn2Click(ActionEvent actionEvent) {
        welcomeText.setText("I'm Mehul");
    }


    public void rateEntered(ActionEvent actionEvent) {
        rateInput = Integer.parseInt(rate.getText());
    }

    public void yearsEntered(ActionEvent actionEvent) {
        yearsInput = Integer.parseInt(years.getText());
    }

    public void loanAmountEntered(ActionEvent actionEvent) {
        loanAmtInput = Integer.parseInt(loanAmt.getText());
    }

    public void monthlyPaymentEntered(ActionEvent actionEvent) {
        monthlyPayInput = Integer.parseInt(monthlyPay.getText());
    }

    public void totalEntered(ActionEvent actionEvent) {

    }
}