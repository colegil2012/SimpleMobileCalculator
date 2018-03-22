package com.coleapps.simplecalculator;

/**
 * Created by Cole on 5/23/2017.
 */

public class Calculation {

    private double firstNumber;
    private double secondNumber;

    private double product;
    private String productAsString;

    public String multiply(String first, String second) {
        firstNumber = Double.parseDouble(first);
        secondNumber = Double.parseDouble(second);

        product = firstNumber * secondNumber;
        productAsString = Double.toString(product);
        return productAsString;
    }

    public String add(String first, String second) {
        firstNumber = Double.parseDouble(first);
        secondNumber = Double.parseDouble(second);

        product = firstNumber + secondNumber;
        productAsString = Double.toString(product);
        return productAsString;
    }

    public String subtract(String first, String second) {
        firstNumber = Double.parseDouble(first);
        secondNumber = Double.parseDouble(second);

        product = firstNumber - secondNumber;
        productAsString = Double.toString(product);
        return productAsString;
    }

    public String divide(String first, String second) {
        firstNumber = Double.parseDouble(first);
        secondNumber = Double.parseDouble(second);

        product = firstNumber / secondNumber;
        productAsString = Double.toString(product);
        return productAsString;
    }
}
