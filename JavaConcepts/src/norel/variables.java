package norel;

public class variables {
    public static void main(String[] args) {
        /*
        Definitions: aka primitive data types
            int = stores integers
            String = stores text
            float = floating point num
            char = single characters like "a"
            boolean = stores T or F

        Syntax - 'type' 'name' =  value;

         */

        String name = "Loren"; //stores string "Loren"
        System.out.println(name); //Takes variable and prints

        int age = 21; //stores int value
        System.out.println(age); //prints value

        int myAge = 21; //initial val
        myAge = 22; //changes val from 21 to 22
        System.out.println(myAge); //prints new value

        final int num = 10; //declares val as final/constant = unchangeable or read only
        System.out.println(num);

        double myDouble = 9.99; //double value
        int myInt = (int) myDouble; //converts double into an int type
        System.out.println(myInt);
    }
}
