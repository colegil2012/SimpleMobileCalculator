package com.coleapps.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, plus, minus, multiply, divide, equals, clear, period;
    private TextView calculation, history;

    private String number1 = "", number2 = "", historyString = "";
    private Boolean isFinal = false;
    private String operation = "";
    private String product = "";

    public final String SUBTRACT = "sub";
    public final String ADD = "add";
    public final String MULTIPLY = "mult";
    public final String DIVIDE = "div";

    public Calculation calc = new Calculation();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculation = (TextView) findViewById(R.id.calculation_text_field);
        history = (TextView) findViewById(R.id.history_text_view);

        num1 = (Button) findViewById(R.id.num_1);
        num1.setOnClickListener(this);
        num2 = (Button) findViewById(R.id.num_2);
        num2.setOnClickListener(this);
        num3 = (Button) findViewById(R.id.num_3);
        num3.setOnClickListener(this);
        num4 = (Button) findViewById(R.id.num_4);
        num4.setOnClickListener(this);
        num5 = (Button) findViewById(R.id.num_5);
        num5.setOnClickListener(this);
        num6 = (Button) findViewById(R.id.num_6);
        num6.setOnClickListener(this);
        num7 = (Button) findViewById(R.id.num_7);
        num7.setOnClickListener(this);
        num8 = (Button) findViewById(R.id.num_8);
        num8.setOnClickListener(this);
        num9 = (Button) findViewById(R.id.num_9);
        num9.setOnClickListener(this);
        num0 = (Button) findViewById(R.id.num_0);
        num0.setOnClickListener(this);

        plus = (Button) findViewById(R.id.plus_button);
        plus.setOnClickListener(this);
        minus = (Button) findViewById(R.id.minus_button);
        minus.setOnClickListener(this);
        multiply = (Button) findViewById(R.id.multiply_button);
        multiply.setOnClickListener(this);
        divide = (Button) findViewById(R.id.division_button);
        divide.setOnClickListener(this);
        equals = (Button) findViewById(R.id.equals_button);
        equals.setOnClickListener(this);
        clear = (Button) findViewById(R.id.clear_button);
        clear.setOnClickListener(this);
        period = (Button) findViewById(R.id.period_button);
        period.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(isFinal == true) {
            switch (v.getId()) {
                case R.id.num_1:
                    number2 += "1";
                    calculation.setText(number2);
                    break;
                case R.id.num_2:
                    number2 += "2";
                    calculation.setText(number2);
                    break;
                case R.id.num_3:
                    number2 += "3";
                    calculation.setText(number2);
                    break;
                case R.id.num_4:
                    number2 += "4";
                    calculation.setText(number2);
                    break;
                case R.id.num_5:
                    number2 += "5";
                    calculation.setText(number2);
                    break;
                case R.id.num_6:
                    number2 += "6";
                    calculation.setText(number2);
                    break;
                case R.id.num_7:
                    number2 += "7";
                    calculation.setText(number2);
                    break;
                case R.id.num_8:
                    number2 += "8";
                    calculation.setText(number2);
                    break;
                case R.id.num_9:
                    number2 += "9";
                    calculation.setText(number2);
                    break;
                case R.id.num_0:
                    number2 += "0";
                    calculation.setText(number2);
                    break;
                case R.id.period_button:
                    number2 += ".";
                    calculation.setText(number2);
                    break;
                case R.id.equals_button:
                    if(operation == ADD) {
                        product = calc.add(number1, number2);
                        historyString += number2;
                        history.setText(historyString);
                        calculation.setText(product);
                        clearAllKeepNum1();
                    } else if(operation == SUBTRACT) {
                        product = calc.subtract(number1, number2);
                        historyString += number2;
                        history.setText(historyString);
                        calculation.setText(product);
                        clearAllKeepNum1();
                    } else if(operation == MULTIPLY) {
                        product = calc.multiply(number1, number2);
                        historyString += number2;
                        history.setText(historyString);
                        calculation.setText(product);
                        clearAllKeepNum1();
                    } else if(operation == DIVIDE) {
                        product = calc.divide(number1, number2);
                        historyString += number2;
                        history.setText(historyString);
                        calculation.setText(product);
                        clearAllKeepNum1();
                    }
                    break;
                case R.id.clear_button:
                    clearAll();
                    break;
                default:
                    break;
            }
        } else {
            switch (v.getId()) {
                case R.id.num_1:
                    number1 += "1";
                    calculation.setText(number1);
                    break;
                case R.id.num_2:
                    number1 += "2";
                    calculation.setText(number1);
                    break;
                case R.id.num_3:
                    number1 += "3";
                    calculation.setText(number1);
                    break;
                case R.id.num_4:
                    number1 += "4";
                    calculation.setText(number1);
                    break;
                case R.id.num_5:
                    number1 += "5";
                    calculation.setText(number1);
                    break;
                case R.id.num_6:
                    number1 += "6";
                    calculation.setText(number1);
                    break;
                case R.id.num_7:
                    number1 += "7";
                    calculation.setText(number1);
                    break;
                case R.id.num_8:
                    number1 += "8";
                    calculation.setText(number1);
                    break;
                case R.id.num_9:
                    number1 += "9";
                    calculation.setText(number1);
                    break;
                case R.id.num_0:
                    number1 += "0";
                    calculation.setText(number1);
                    break;
                case R.id.period_button:
                    number1 += ".";
                    calculation.setText(number1);
                    break;
                case R.id.plus_button:
                    if(!number1.equals("")) {
                        isFinal = true;
                        historyString = (number1 + " + ");
                        history.setText(historyString);
                        calculation.setText(number2);
                        operation = ADD;
                    } else {}
                    break;
                case R.id.minus_button:
                    if(!number1.equals("")) {
                        isFinal = true;
                        historyString = (number1 + " - ");
                        history.setText(historyString);
                        calculation.setText(number2);
                        operation = SUBTRACT;
                    } else {}
                    break;
                case R.id.multiply_button:
                    if(!number1.equals("")) {
                        isFinal = true;
                        historyString = (number1 + " * ");
                        history.setText(historyString);
                        calculation.setText(number2);
                        operation = MULTIPLY;
                    } else {}
                    break;
                case R.id.division_button:
                    if(!number1.equals("")) {
                        isFinal = true;
                        historyString = (number1 + " / ");
                        history.setText(historyString);
                        calculation.setText(number2);
                        operation = DIVIDE;
                    } else {}
                    break;
                case R.id.clear_button:
                    clearAll();
                    break;
                default:
                    break;
            }
        }
    }

    public void clearAllKeepNum1() {
        number1 = "";
        number2 = "";
        isFinal = false;
        historyString = "";
        product = "";
    }

    public void clearAll() {
        number1 = "";
        number2 = "";
        isFinal = false;
        historyString = "";
        product = "";
        history.setText("");
        calculation.setText("");
    }
}
