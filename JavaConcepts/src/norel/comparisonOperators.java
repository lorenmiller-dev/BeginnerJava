package norel;

import java.util.Scanner;

public class comparisonOperators {

    public static void main(String[] args) {
        //comparison operators
        int x = 3;
        int y = 1;

        //compare x and y if they are equal
        System.out.println(x == y); //equal to
        System.out.println(x != y); //not equal to
        System.out.println(x > y); //greater than
        System.out.println(x < y); //less than

        boolean highIncome = true;
        boolean goodCredit = true;
        boolean criminalRecord = false;

        boolean eligible = (highIncome || goodCredit) && !criminalRecord;

        //if else statements
        Scanner scan = new Scanner(System.in);

        System.out.println("What is today's temperature: ");
        int temp = scan.nextInt();

        if (temp > 30){
            System.out.println("It is hot outside");
        } else if (temp > 20) {
            System.out.println("It is nice outside");
        } else {
            System.out.println("It is cold outside");
        }

        /* simplifying if else statements, most professional
        System.out.println("What is your income? ");
        int income = scan.nextInt();
        boolean highIncome = (income > 100000);
         */

        //Ternary Operator
        System.out.println("You want to buy a plane ticket, what is your income?");
        int income = scan.nextInt();
        String className = income > 100000 ? "you can afford a First class ticket" : "you buy an Economy class ticket"; //Ternary operator
        // condition, true? picks first, false? picks second
        System.out.println(className);
    }
}
