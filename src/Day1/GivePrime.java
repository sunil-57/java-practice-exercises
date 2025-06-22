package Day1;

import java.util.Scanner;

public class GivePrime {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a starting point:");
        int startingPoint = userInput.nextInt();
        System.out.println("Enter a ending point:");
        int endPoint = userInput.nextInt();
        while(startingPoint <= endPoint)
        {
            int factor = 0;
            System.out.println("Checking for: " + startingPoint);
            for(int i = 1;i <= startingPoint; i++)
            {
                if(startingPoint % i== 0){
                    factor = factor + 1;
                }
            }
            System.out.println("Number of factor: " + factor);
            if(factor == 2){
                System.out.println("Prime number: "+ startingPoint);
                count = count + 1;
            }
            startingPoint = startingPoint + 1;
        }
        System.out.println("Number of prime numbers: "+ count);
    }
}
