package Day1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //ask number from user
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int number_to_check = userInput.nextInt();
        int remainder = 0;
        int sum = 0;
        // how do i divide number by every number given by user?-> could use a for loop
        for(int divisor = 1; divisor < number_to_check; divisor++){
            remainder = number_to_check % divisor;
        // decide which is the divisor? -> if else
            if(remainder == 0){
                System.out.println("The divisor is "+ divisor);
                //TODO sum of divisor?
                sum = sum + divisor;
            }
        }
        System.out.println("The sum of the divisors is "+ sum);
        // decide the number and sum of divisor is equal or not??
        if(number_to_check == sum){
            System.out.println("The number is perfect number...");
        }else{
            System.out.println("The number is not a perfect number...");
        }
    }
}
