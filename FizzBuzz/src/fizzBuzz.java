import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scan.nextInt();

        //if number is divisible by both 5 and 3 return fizzbuzz
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number / 3 == 0){
            //if number is divisible by 3 return buzz
            System.out.println("Buzz");
        } else if (number % 5 == 0){
            //if number is divisible by 5 return buzz
            System.out.println("Fizz");
        } else {
            //not 3 and 5 return number
            System.out.println(number);
        }
    }
}
