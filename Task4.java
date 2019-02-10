import java.util.Scanner;

public class Task4{
    public static void main(String[] args){
        int[] temps = new int[30];
        Scanner myObj = new Scanner(System.in);
        System.out.println("input temperature for each day of the month(30 days)");

        for(int i=0; i<temps.length; i++){
            int temp = myObj.nextInt();
            temps[i] = temp;
        } 
        int maxtemp = temps[0];
        int hottestday = 1;
        int mintemp = temps[0];
        int coldestday = 1;
        int sum = 0;
        for(int i=1; i<temps.length; i++){
            if(maxtemp<temps[i]){
                maxtemp = temps[i];
                hottestday = i+1;
            }
            if(mintemp>temps[i]){
                mintemp = temps[i];
                coldestday = i+1;
            }
            sum += temps[i];
        } 
        System.out.println("Hottest day was " + hottestday + " with temperature " + maxtemp + " degree");
        System.out.println("Coldest day was " + coldestday + " with temperature " + mintemp + " degree");

        int average = sum/temps.length;
        System.out.println("The average temperature is " + average);

        int difference = maxtemp - mintemp;
        System.out.println("The difference between hottest and coldest days is " + difference);
    }
}