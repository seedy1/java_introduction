
public class DataTypes {
    public static void main(String[] args) {
        
        // Data types string, int, double, float, char, boolean
        String name = "this is a string";
        System.out.println(name);

        char ini = 'c';
        System.out.println(ini);

        int age = 28;
        System.out.println(age);

        double x1 = 45.6686;
        System.out.println(x1);

        float x2 = 7.56f;
        System.out.println(x2);


        boolean eaten = true;
        System.out.println(eaten);
        

        // Assigning 
        // <--
        String surname = "papap";
        String nickname = surname;



        // simple addition
        int firstNumber = 4;
        int secondNumber = 5;
        int sum = firstNumber- secondNumber;
        System.out.println(sum);

        System.out.println("FOR");

        // for

        // 1 2 3 4 5 6 7 8 9
        for(int i=1;i<10;i++){
            System.out.println(i);
        }
        System.out.println("If else");

        boolean rain = true;
        // if else
        if(rain){ //condition
            //action
            System.out.println("go out");
        }else{
            System.out.println("do not go out");
        }


    }
    
}