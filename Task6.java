import java.util.Scanner;

public class Task6{
    public static void main(String[] args){
        start();
    }
    static void start(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Write 6 digit positive number");
        int number;

        if(myObj.hasNextInt()) {
            number = myObj.nextInt();
            if(number>99999 && number<1000000)
                checker(number);
            else{
                System.out.println("Read instructions carefuly please");   
                start();
            }
        }
        else{
            System.out.println("Read instructions carefuly please!!!!");
            System.out.println("Inputed number is invalid.");
            start();
        }

        
    }

    static void checker(int number){
        String helper = Integer.toString(number);
        int checker = 0;
        for(int i = 0; i<helper.length(); i++){
            if(i<helper.length()-3)
                checker += Integer.parseInt(Character.toString(helper.charAt(i)));
            else 
                checker -= Integer.parseInt(Character.toString(helper.charAt(i)));
 
        }
        if(checker==0)
            System.out.println("U`ve got a lucky number!!! cheers!!!");
        else   
            System.out.println("Looseeer!!!");

    }
}