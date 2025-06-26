package Day1;
// Write a program to reverse a number (e.g., 1234 becomes 4321).
public class Reverse {
    public static void main(String[] args) {
        int old_number = 1234;
        int new_number = 0;
        while(old_number > 0){
            //TODO take out individual digits
            // you may use % operator
            int digit = 0;
            digit = old_number % 10;
            //TODO remove the digits from units place
            // you may use / operator
            old_number = old_number / 10;
            //TODO create a new number using individual digits
            // think how we create numbers
            new_number = new_number * 10 + digit;
        }
        System.out.println("Reversed number: "+ new_number);
    }
}
