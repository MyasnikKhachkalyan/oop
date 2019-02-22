import java.util.Scanner;
import java.lang.Math.*;
public class Example{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        // int num = 1234;
        // int i = 1;
        // int rev = 0;
        // do{
        //     i = i*10;
        // } while(num/i>=1);
        // System.out.println(i);
        // for(i=i/10;i>=1;i/=10){
        //     rev += num%10*i;
        //     num=(num-(num%10))/10;
        // }
        // System.out.println(rev);

        // String a = "abcde";
        // for(int h=1;h<=a.length();h++){
        //     for(int i=0;i<a.length();i++){
        //         if(i+h<=a.length()){
        //             System.out.println(a.substring(i, i+h));
        //         }
        //         break;
        //     }
        // }

        // String b ="aBcZ";
        // String crypt = "";
        // for(int i=0; i<b.length();i++){
        //     if((int)b.charAt(i)>=65 && (int)b.charAt(i)<=90){
        //         crypt += (char)(97+((int)b.charAt(i)+34-97)%26);
        //     }
        //     else if((int)b.charAt(i)>=97 && (int)b.charAt(i)<=122){
        //         crypt += (char)(65+((int)b.charAt(i)-34-65+26)%26);
        //     }
        //     else{
        //         crypt+=b.charAt(i);
        //     }
        // }
        // System.out.println(crypt);


        //ex 2
        // int m = myObj.nextInt();
        // boolean mIsPrime = false;
        // int primeCounter = 0;
        // for(double j = 2.0; j<=Math.sqrt(m); j++){
        //     if(m%j!=0.0){
        //         mIsPrime = true;
        //     }
        //     else {
        //         mIsPrime = false;
        //         break;
        //     }
        // }
        // if(mIsPrime) {
        //     System.out.println("prime" + m);
        //     primeCounter ++;
        // }
        // System.out.println("input 100 or 200 or  ... or 1000");
        // int k = myObj.nextInt();
        // for(int i = 0; i<k; i++){
        //     double randNum = Math.floor(Math.random()*m);
        //     boolean randNumIsPrime = false;
        //     for(double j = 2.0; j<=Math.sqrt(randNum); j++){
        //         if(randNum%j!=0.0){
        //            randNumIsPrime = true;
        //         }
        //         else{
        //             randNumIsPrime = false;
        //             break;
        //         }
        //     }
        //     if(randNumIsPrime) {
        //         System.out.println("prime" + randNum);
        //         primeCounter ++;
        //     }
        // }

        //ex 3
        // int n = myObj.nextInt();
        // long[] fib = new long[n]; 
        // fib[0] = 1;
        // fib[1] = 1;
        // for(int i = 2; i<n; i++){
        //     fib[i]= fib[i-1] + fib[i-2]; 
        // }
        // System.out.println(fib[n-1]);

        //ex4
        // int number = myObj.nextInt();
        // int digit = number; 
        // int help = number;
        // for(help = number;digit>=10;help=digit){
        //     digit=0;
        //     while(help!=0){
        //         digit += help%10;
        //         help = (help - help%10)/10;
        //     }
        //     System.out.println(digit);
        // }
        // System.out.println(digit);

        //ex7
        //System.out.println("write two string length of 1st one bigger than length of 2nd one");
        // String str1 = myObj.nextLine();
        // String str2 = myObj.nextLine();
        // int matchCount = 0;

        // String[] cyclShft = new String[str2.length()];
        // cyclShft[0] = str2;
        // for(int i=1; i<str2.length(); i++){
        //     cyclShft[i] = cyclShft[i-1].substring(1,cyclShft[i-1].length()) + cyclShft[i-1].charAt(0);
        // }
        // // for(int i= 0; i<cyclShft.length; i++){
        // //     System.out.println(cyclShft[i]);
        // // }

        // for(int i = 0; i<=str1.length()-str2.length(); i++){
        //     for(int j= 0; j<cyclShft.length; j++){
        //         if(str1.substring(i,i+str2.length()).equals(cyclShft[j])){ 
        //             matchCount++;
        //         }    
        //     }
        // }
        // System.out.println(matchCount);
        
        
        
        // stars(5,1);
    }

    // public static void stars(int a, int c){  
    //     int b = a-1;
    //     if(a==0) return;
        
    //     for(int i=b;i>0;i--){
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=c;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     stars(a-1, c+2);
    // }
}
