import java.util.Scanner;

public class Task5{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        String[] parts = input.split(" "); 

        if(Integer.parseInt(parts[0]) == (parts.length-1)){
            for(int i = 1; i<parts.length; i+=2){
                if(i!=parts.length-1){
                    String helper = parts[i];
                    parts[i] = parts[i+1];
                    parts[i+1] = helper;
                }
            }
            for(int i = 1; i<parts.length; i++){
                System.out.print(parts[i] + " ");
            }
        }
        else System.out.println("Number of written words should be equal to inputed number");
        
        System.out.println();
        
        
    }
}