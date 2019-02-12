import java.util.Scanner;

public class Task8{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        long numbers = 0L;
        int helper = 1;

        for (int i=0; i<num; i++){
            helper*=2;
        }
        printBin(numbers, helper, num);
    }
    public static void printBin(long numbers, int helper, int num){
        boolean accaptable = false;
        if(numbers==helper){
            return;
        }
        String binaryNum = String.format("%0"+num+"d", Long.parseLong(Long.toBinaryString(numbers)));
        for(int j=0;j<binaryNum.length()-1;j++){
                    if(binaryNum.charAt(j)=='0' && binaryNum.charAt(j)==binaryNum.charAt(j+1)){
                        accaptable=false;
                        break;
                    }
                    else{
                        accaptable=true;
                    }

            }
        if(accaptable){
                    System.out.println(binaryNum);
            }
        printBin(numbers+1, helper, num);        

    }
    
}