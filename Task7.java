public class Task7{
    public static void main(String[] args){
        int num = 5; 
        int help = 0;
        int[][] matrix = new int[num][num];
        int i,j = 0;
        for(i=0; i<num; i++) {
            if(j==num && i!=0 && i!=num-1){
                matrix[i][j-1]=num+i;
                help++;
            }
            if(i!=0 && i!=num-1){
                matrix[i][0]= (num*4-3)-i;
                help++;
            }
            for(j=0; j<num; j++) {
                if(i==0){ 
                    matrix[i][j] = j+1;
                    help++;
                }
                else if(i==num-1){
                    matrix[i][j]= (num*3-2)-j;
                    help++;
                }
                // if(matrix[1][0]){
                //     num*5-6
                // }
                System.out.print(matrix[i][j] + "     ");
            }
            System.out.println("");
        }
        System.out.println(help);
        // for (int i=1; i<=num; i++){
        //     for(int j=1; j<=num; j++){
        //         System.out.print(j);

        //     }
        // }  12345
    }      //     6
              //  7
              //  8
              //  131211109  
}   