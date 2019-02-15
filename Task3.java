import java.util.Scanner;

public class Task3{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Write number to calculate its factorial");
        int factNum = myObj.nextInt();  // max value of factNum that can be computed is 20

        long factorial = 1;
        for(int i=factNum; i>0; i--){
            factorial *= i;
        }
        System.out.println(factorial);
        System.out.println(calcFact(factNum));
    }
    public static long calcFact (int num){
        if(num==1){
            return 1;
        }
        return num*calcFact(num-1);
    }
}