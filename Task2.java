import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        System.out.println("Write power of 10 which name u want know");
        Scanner myObj = new Scanner(System.in);
        
        int power = myObj.nextInt();

        switch (power){
            case 6:
                System.out.println("Million");
                break;
            case 9:
                System.out.println("Billion");
                break;
            case 12:
                System.out.println("Trillion");
                break;
            case 15:
                System.out.println("Quadrillion");
                break;    
            case 18:
                System.out.println("Quintillion");
                break; 
            case 21:
                System.out.println("Sextillion");
                break;           
            case 30:
                System.out.println("Nonillion");
                break;      
            case 100:
                System.out.println("Googol");
                break;    
            default:
                System.out.println("the input value that has no corresponding name");
                break;        
        }

        if(power == 6){
            System.out.println("Million");
        }
        else if(power == 9){
            System.out.println("Billion");
        }
        else if(power == 12){
            System.out.println("Trillion");
        }
        else if(power == 15){
            System.out.println("Quadrillion");
        }
        else if(power == 18){
            System.out.println("Quintillion");
        }
        else if(power == 21){
            System.out.println("Sextillion");
        }
        else if(power == 30){
            System.out.println("Nonillion");
        }
        else if(power == 100){
            System.out.println("Googol");
        }
        else{
            System.out.println("the input value that has no corresponding name");
        }

        
    }
}