public class Task1{
    public static void main(String[] args){
        int grade = 4;
        int a,b ;
        switch (grade){
            case 10:
                a = 1;
                b = 2;
                break;
            case 9:
                a = 1;
                b = 2;
                break;
            case 8:
                a = 3;
                b = 4;
                break;
            default:
                a = 5;
                break;            
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int sum = 0;
        int power = 1;
        int i = 0;

        while(i<25){ // each of () represents value of sum  and by , is separated values of power during each iteration
            sum += power;        //(((((((((((((((((((((((((0 + 1) + 2) + 4) + 8) + 16) + 32) + 64) + 128) + 256) + 512) + 1024) + 2048) + 4096) + 8192) + 16384) + 32768) + 65536) + 131072) + 262144) + 524288) + 1048576) + 2097152) + 4194304) + 8388608) + 16777216)
            power = power << 1;  //2 , 4 , 8 , 16 , 32 , 64 , 128 , 256 , 512 , 1024 , 2048 , 4096 , 8192 , 16384 , 32768 , 65536 , 131072 , 262144 , 524288 , 1048576 , 2097152 , 4194304 , 8388608 , 16777216 , 33554432
            i++;
        }
        // System.out.println(sum); // 33445531 
        // System.out.println(power); // 33445532
    }
}