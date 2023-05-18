package norel;

import java.util.Scanner;

public class switchStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int role = scan.nextInt();

        switch (role) {
            case 1:
                System.out.println("Admin");
                break;

            case 2:
                System.out.println("Moderator");
                break;

            default:
                System.out.println("Guest");
        }

        /* basic if else statement checking what the user's role is (bad way)
        if (role == "Admin"){
            System.out.println("You are an Admin");
        } else if (role == "moderator"){
            System.out.println("You are a moderator");

        } else {
            System.out.println("You are a guest");

        }
         */
    }
}
