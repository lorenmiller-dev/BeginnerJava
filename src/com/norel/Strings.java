package com.norel;

public class Strings {
    public static void main(String[] args) {

        String message = "Hello" + "Jr"; //can combine two strings, not as optimal
        System.out.println(message);

        //check to see if string ends or starts with char we are looking for
        System.out.println(message.startsWith("H")); //looks if string starts with "H"
        System.out.println(message.endsWith("r")); //if string ends with "r"
        System.out.println(message.startsWith("h")); //if capitalization affects output (it does)

        //check strings length and index val
        System.out.println(message.length()); //gets string length
        System.out.println(message.indexOf("H")); //gets index value of char (H = 0, e = 1 ...)

        //replaces part of string
        System.out.println(message.replace("Jr", " JR")); //returns new string with replaced string

        //converts string to either all upper or lower cases
        System.out.println(message.toUpperCase()); //returns upper case string
        System.out.println(message.toLowerCase()); //returns lower case string

        //trim any unwanted or unnecessary white space
        String newMessage = "   Hello" + " JR     "; //removes white space before and after string
        System.out.println(newMessage.trim()); //trimmed string
        System.out.println(newMessage); //original string

    }
}
