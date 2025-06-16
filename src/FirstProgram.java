import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.println("What to check???");
        int number_to_check = myInput.nextInt();
        //number is greater than 0 vayo vane positive
        if(number_to_check > 0){
            System.out.println("Positive ho yo number");
        }//number is less than 0 vayo vane negative
        else if(number_to_check < 0){
            System.out.println("Negative ho yo number");
        }//otherwise its Zero
        else{
            System.out.println("Zero ho yo number");
        }
    }
}
