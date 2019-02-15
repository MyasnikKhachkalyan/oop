import java.util.Scanner;

public class Task8{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        long numbers = 0L; // type is long because in case of 11  adn 12 its gives java.lang.NumberFormatException: error if type is int
        int helper = 1;

        for (int i=0; i<num; i++){
            helper*=2; // nuber of recusrive cals
        }
        printBin(numbers, helper, num);
    }
    public static void printBin(long numbers, int helper, int num){
        boolean accaptable = false;
        if(numbers==helper){
            return;
        }
        String binaryNum = String.format("%0"+num+"d", Long.parseLong(Long.toBinaryString(numbers))); // this is to get n length strings
        for(int j=0;j<binaryNum.length()-1;j++){
                    if(binaryNum.charAt(j)=='0' && binaryNum.charAt(j)==binaryNum.charAt(j+1)){ // to not print  when it finds two consecutive 0
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

    } //// for n=4 i have 16 recusrsive calls, the nuber of prints are Fibonaci numbers
      /// this program deos not work well for n=12, but I talked Ms Varduhi and she said that its ok.
}