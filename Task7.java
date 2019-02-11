import java.util.Scanner;

public class Task7{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("write a number to make a matrix");
        int num = myObj.nextInt(); 
        int help = 0;
        int[][] matrix = new int[num][num];
        int i = 0;
        int j = -1;

        horizontal(i,j,num,help,matrix,true);


        for(int x=0; x<num; x++){
            for(int y=0; y<num; y++){
                if(x==0 && num>4){
                    System.out.print(matrix[x][y] + "    ");
                }
                else if(num==4 && (x==0 || x==num-1)){
                    System.out.print(matrix[x][y] + "    ");
                }
                else System.out.print(matrix[x][y] + "   ");
            }  
                            System.out.println(""); 
        }  
    } 
    static void horizontal(int a, int b, int num, int help, int[][] matrix, boolean right){
        if(help!=num*num+1){
            if(right){
                int j;
                b++;
                help++;
                for(j=b; j<num; j++) {
                    if(j<=num-1){
                        if(matrix[a][j]==0){
                            matrix[a][j] = help;
                            help++;  
                        }
                        else{
                            j--;
                            vertical(a,j,num,help,matrix,true);
                            break;
                        }    
                    }    
                } 
                if(j==num && a==0){
                    vertical(a,j-1,num,help,matrix,true);
                }

            }       
            else{
                int j;
                b--;
                for(j=b; j>=0; j--) {
                    if(j>=0){
                        if(matrix[a][j] == 0){
                            matrix[a][j] = help;
                            help++; 
                        }
                        else{
                            j++;
                            vertical(a,j,num,help,matrix,false);
                            break;
                        }
                    }    
                }
                if(j==-1 && a==num-1){
                        vertical(a,j+1,num,help,matrix,false);
                    }  
            }
        }
    }
    static void vertical(int a, int b, int num, int help, int[][] matrix, boolean down){
        if(help!=num*num+1){
            if(down){
                int i;
                a++;
                for(i=a; i<num; i++) {
                    if(i<=num-1){
                        if(matrix[i][b]==0){
                            matrix[i][b] = help;
                            help++;
                        }
                        else{
                            i--;
                            horizontal(i,b,num,help,matrix,false);
                            break;
                        }
                    }      
                }
                if(i==num && b==num-1){
                        horizontal(i-1,b,num,help,matrix,false);
                    }
            } 
            else{
                a--;
                for(int i=a; i>=0; i--) {
                        if(matrix[i][b]==0){
                            matrix[i][b] = help;
                            help++;
                        }
                        else{
                            i++;
                            help--;
                            horizontal(i,b,num,help,matrix,true);
                            break;
                        }
                    }
                        
                
            } 
        }
    }        
}   
