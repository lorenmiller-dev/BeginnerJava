package com.norel;

import java.util.Arrays;

public class learnArray {
    public static void main(String[] args) {

        int[] array = {2, 1, 3, 5, 4};
        Arrays.sort(array); //sorts array from least to greatest
        System.out.println(Arrays.toString(array)); //passes the int array and prints out a string
        //System.out.println(array.length); //prints length of array

        //multidimensional arrays
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers)); //deepToString prints out multidimensional array

        int[][] numbers2 = {{1,2,3},{4,5,6}}; //utilizes {} for array
        System.out.println(Arrays.deepToString(numbers2)); //prints array

        //constants
        final float pi = 3.14F; //initializes pi and cannot be changed, seen as constant

        //arithmetic expressions
        int add = 10+3;
        int subtract = 10-3;
        int multiply = 10*3;
        int divide = 10/3;
        int mod = 10%3;

        //implicit casting
        //byte > short > int > long > float > double
        //double x = 1.1;
        //int y = (int)x + 2;
        //System.out.println(y);

        String x = "1";
        int y = Integer.parseInt(x) + 2; //converts string to int to add to 2
        System.out.println(y);

        String z = "1.1";
        double w = Double.parseDouble(z) + 2.0; //parses/converts string of 1.1 to double value
        System.out.println(w);

        //math class
    }
}