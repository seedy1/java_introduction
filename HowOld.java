import java.util.Scanner;

public class HowOld {
    
    public static void main(String[] args) {

        // variables needed, correct types
        int age, dob, currentYear = 2020;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your date of birth:");
        
        dob = input.nextInt();

        // System.out.println("bod entered by user: "+dob);

        if(dob >= currentYear){
            System.out.println("Enter a dob less than"+ currentYear);
        }else{
            age = currentYear - dob;

        System.out.println("Your age is: "+age);

        }

        

        // prompting users to enter input

        // use input to calculate age
        // print users age

        // do some control try and catch
    }

}