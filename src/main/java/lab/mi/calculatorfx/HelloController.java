package lab.mi.calculatorfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    private double number1;
    private double number2;
    private double result;
    private Operators operation;

    // field taken from SceneBuilder skeleton
    // Provide all buttons, and else of our "app"

    @FXML
    private Button bttAdd;

    @FXML
    private Button bttCancel;

    @FXML
    private Button bttComa;

    @FXML
    private Button bttDivide;

    @FXML
    private Button bttEight;

    @FXML
    private Button bttEqual;

    @FXML
    private Button bttFive;

    @FXML
    private Button bttFour;

    @FXML
    private Button bttMultiply;

    @FXML
    private Button bttNine;

    @FXML
    private Button bttOne;

    @FXML
    private Button bttProcantage;

    @FXML
    private Button bttSeven;

    @FXML
    private Button bttSign;

    @FXML
    private Button bttSix;

    @FXML
    private Button bttSubtract;

    @FXML
    private Button bttThree;

    @FXML
    private Button bttTwo;

    @FXML
    private Button bttZero;

    @FXML
    private TextField tvText;

    @FXML
    void btnClearClicked(ActionEvent event) { //Returnes both values of number1/2 as zero- clears them
        if (event.getSource() == bttCancel) {
            tvText.setText("");
        }
        number2 = 0;
        number1 = 0;
    }
    @FXML
    void btnComaClicked(ActionEvent event) {
        // adds a comma, when needed, unfortunately it has to be dot on dispaly as we perform calculations on double primitive values
        if (event.getSource() == bttComa) {
            String text = tvText.getText();
            text += ".";
            tvText.setText(text);
        }
        number2 = Double.parseDouble(tvText.getText());

    }
    @FXML
    void btnDivideClicked(ActionEvent event) { // it makes adnotation to function in Enum.class Operations, methods are performed after clicking equal button
        operation = Operators.DIVIDE;
        number1 = Double.parseDouble(tvText.getText());
        tvText.setText("");

    }

    @FXML
    void btnEqualClicked(ActionEvent event) { // perfomes enums.class Operations ADD, SUBTRACT, DIVIDE, MULTIPLY
        switch (operation) {
            case ADD -> {
                result = number1 + number2;
                tvText.setText(String.valueOf(result));
                number1 = result;
                number2 = 0;
            }
            case SUBTRACT -> {
                result = number1 - number2;
                tvText.setText(String.valueOf(result));
                number1 = result;
                number2 = 0;
            }
            case DIVIDE -> {
                result = number1 / number2;
                tvText.setText(String.valueOf(result));
                number1 = result;
                number2 = 0;
            }
            case MULTIPLY -> {
                result = number1 * number2;
                tvText.setText(String.valueOf(result));
                number1 = result;
                number2 = 0;
            }

        }


    }
    @FXML
    void btnZeroClicked(ActionEvent event) { // puts zero to display
        if (event.getSource() == bttZero) {
            String text = tvText.getText();
            text += "0";
            tvText.setText(text);
        }
        number2 = Double.parseDouble(tvText.getText());

    }
    @FXML
    void btnOneClicked(ActionEvent event) { // puts one to dispaly
        if (event.getSource() == bttOne) {
            String text = tvText.getText();
            text += "1";
            tvText.setText(text);
        }
        number2 = Double.parseDouble(tvText.getText());
    }
    @FXML
    void btnTwoClicked(ActionEvent event) { // puts two to dispaly
        if (event.getSource() == bttTwo) {
            String text = tvText.getText();
            text += "2";
            tvText.setText(text);
        }
        number2 = Double.parseDouble(tvText.getText());
    }

    @FXML
    void btnThreeClicked(ActionEvent event) { // puts three to dispaly
        if (event.getSource() == bttThree) {
            String text = tvText.getText();
            text += "3";
            tvText.setText(text);
        }
        number2 = Double.parseDouble(tvText.getText());
    }

    @FXML
    void btnFourClicked(ActionEvent event) { // puts four to dispaly
        if (event.getSource() == bttFour) {
            String text = tvText.getText();
            text += "4";
            tvText.setText(text);
        }
        number2 = Double.parseDouble(tvText.getText());

    }

    @FXML
    void btnFiveClicked(ActionEvent event) { // puts five to dispaly
        if (event.getSource() == bttFive) {
            String text = tvText.getText();
            text += "5";
            tvText.setText(text);
        }
        number2 = Double.parseDouble(tvText.getText());

    }
    @FXML
    void btnSixClicked(ActionEvent event) { // puts six to dispaly
        if (event.getSource() == bttSix) {
            String text = tvText.getText();
            text += "6";
            tvText.setText(text);
        }
        number2 = Double.parseDouble(tvText.getText());
    }
    @FXML
    void btnSevenClicked(ActionEvent event) { // puts seven to dispaly
        if (event.getSource() == bttSeven) {
            String text = tvText.getText();
            text += "7";
            tvText.setText(text);
        }
        number2 = Double.parseDouble(tvText.getText());
    }
    @FXML
    void btnEightClicked(ActionEvent event) { // puts 8 to display
        if (event.getSource() == bttEight) {
            String text = tvText.getText();
            text += "8";
            tvText.setText(text);
        }
        number2 = Double.parseDouble(tvText.getText());
    }
    @FXML
    void btnNineClicked(ActionEvent event) { // puts nine to dispaly
        if (event.getSource() == bttNine) {
            String text = tvText.getText();
            text += "9";
            tvText.setText(text);
        }
        number2 = Double.parseDouble(tvText.getText());

    }

    @FXML
    void btnMinusClicked(ActionEvent event) { // performs substution
        operation = Operators.SUBTRACT;
        number1 = Double.parseDouble(tvText.getText());
        tvText.setText("");
    }

    @FXML
    void btnMultiplyClicked(ActionEvent event) { // multiplies numbers
        operation = Operators.MULTIPLY;
        number1 = Double.parseDouble(tvText.getText());
        tvText.setText("");
    }


    @FXML
    void btnPlusClicked(ActionEvent event) { // adds a values
        operation = Operators.ADD;
        number1 = Double.parseDouble(tvText.getText());
        tvText.setText("");
    }

    @FXML
    void btnProcantageClicked(ActionEvent event) { // divides result by hundred and returnes value as 0,nn
        if(event.getSource()==bttProcantage) {
            String text = tvText.getText();
            number1 = Double.parseDouble(text);
            number2 = number1;
            result = number2 / 100.0;
            tvText.setText(String.valueOf(result));
        }
    }

    @FXML
    void btnSignClicked(ActionEvent event) { // changes the sign of our number
        if (event.getSource() == bttSign) {
            String text = tvText.getText();
            number1 = Double.parseDouble(text);
            number2 = number1;
            result = number2 * (-1);
            tvText.setText(String.valueOf(result));
        }
    }

}







