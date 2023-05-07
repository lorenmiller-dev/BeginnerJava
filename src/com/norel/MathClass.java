package com.norel;

import java.text.NumberFormat;

public class MathClass {
    public static void main(String[] args) {

        /*
        formatting numbers
         */
        String result = NumberFormat.getPercentInstance().format(0.1); //chain methods using number format package to get percent and formats it
        System.out.println(result); //prints result

        String result2 = NumberFormat.getCurrencyInstance().format(106453.90);
        System.out.println(result2);
    }
}
