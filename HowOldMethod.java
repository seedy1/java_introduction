import java.util.Scanner;

public class HowOldMethod {
    // available to all methods; static
    static int currentYear = 2020;
    
    public int dob(int birthYear){

        int age;
        age = currentYear - birthYear;

        return age;
    }

    public static void main(String[] args) {

        HowOldMethod tester = new HowOldMethod();
        
        int age, dob;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your date of birth:");
        dob = input.nextInt();

        if(dob >= currentYear){
            System.out.println("Enter a dob less than"+ currentYear);
        }else{
            age = tester.dob(dob);
            System.out.println("Your age is: "+age);
        
        }

    }

}