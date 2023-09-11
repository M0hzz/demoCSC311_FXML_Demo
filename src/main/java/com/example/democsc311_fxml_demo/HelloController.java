package com.example.democsc311_fxml_demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import static java.lang.Math.pow;

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
    private TextField loanAmount;
    @FXML
    private TextField monthlyPayment;
    @FXML
    private TextField total;


    @FXML

    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    double rateInput;
    double yearsInput;
    double loanAmtInput = 1.0;
    double monthlyPay1;
    double totalPayed1;

    private static final DecimalFormat df = new DecimalFormat("0.00");
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
        rateInput = rateInput / 100;

        monthlyPay1 = ((loanAmtInput * (rateInput/12.0)) / (1 - (pow((1 + rateInput/12.0),(yearsInput * -12.0)))));
                //((loanAmtInput * (rateInput/12)) / (1-(pow((1 + rateInput/12),(yearsInput * 12)))));
        monthlyPayment.setText(String.valueOf(df.format(monthlyPay1)));

        totalPayed1 = monthlyPay1 * 12 * yearsInput;
        total.setText(String.valueOf(df.format(totalPayed1)));
    }



    public void onBtn2Click(ActionEvent actionEvent) {
        welcomeText.setText("I'm Mehul");
    }


    public void rateEntered(ActionEvent actionEvent) {
        rateInput = Double.parseDouble((rate.getText()));
    }

    public void yearsEntered(ActionEvent actionEvent) {
        yearsInput = Double.parseDouble(years.getText());
    }

    public void loanAmountEntered(ActionEvent actionEvent) {
        loanAmtInput = Double.parseDouble(loanAmount.getText());

    }

    public void monthlyPaymentEntered(ActionEvent actionEvent) {


    }

    public void totalEntered(ActionEvent actionEvent) {

    }
}