public class Task8{
    public static void main(String[] args){
        int num = 5;
        int numbers = 0;
        int helper = 1;
        int index = 0;
        boolean accaptable = false;

        for (int i=0; i<num; i++){
            helper*=2;
        }
        String[] resultArr = new String[helper];
        for(int i=0; i<helper; i++){
            String binaryNum = String.format("%0"+num+"d", Integer.parseInt(Integer.toBinaryString(numbers)));
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
                    resultArr[index] = binaryNum;
                    index++;
            }
                numbers++;
        }
    }
}