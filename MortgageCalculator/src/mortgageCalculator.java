import java.util.Scanner;

public class mortgageCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //take user input for principal
        System.out.println("Principal: ");
        int principal = scan.nextInt();
        //input for interest rate
        System.out.println("Annual Interest: ");
        float annualInterest = scan.nextFloat();
        //input for period in years
        System.out.println("Period (years): ");
        byte years = scan.nextByte();

        //calculate monthly interest
        float monthlyInterest = getMonthlyInterest(annualInterest);

        //convert years to months
        int periodInMonths = periodInMonths(years);

        //calculate mortgage payment
        double mortgagePayment = mortgage(principal, monthlyInterest, periodInMonths);

        System.out.println("Your monthly mortgage payment is: $" + mortgagePayment);
    }

    //finalized variables
    private static final byte percent  = 100;
    private static final byte months = 12;

    /**
     * Calculates the monthly interest rate based on the annual interest rate
     * @param annualInterest the annual interest rate
     * @return the monthly interest rate
     */
    public static float getMonthlyInterest(float annualInterest) {
        return (annualInterest / percent / months);
    }

    /**
     * Converts the period in years to the period in months
     * @param years the number of years in the period
     * @return the number of months in the period
     */
    public static int periodInMonths (byte years) {
        return years * months; //convert years into months
    }

    /**
     * Calculates the mortgage payment
     * @param principal the principal amount of the mortgage
     * @param monthlyInterest the monthly interest rate
     * @param periodInMonths the period of the mortgage in months
     * @return the monthly mortgage payment
     */
    public static double mortgage(int principal, float monthlyInterest, int periodInMonths){
        return (principal * monthlyInterest * Math.pow(1 + monthlyInterest, periodInMonths) /
                (Math.pow(1 + monthlyInterest, periodInMonths) - 1)); //mortgage equation
    }
}
