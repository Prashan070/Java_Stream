package JavaStreamPractice.DSA;

public class ClimblingStair {

    public static int climbingStairMethod(int number) {
        if(number ==1) return 1;
        if(number==2)return  2;
        int result =0;
        int a=1;
        int b=2;
        for(int i=3 ; i<=number ; i++){
            result = a+b;
            a=b;
            b=result;

        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(ClimblingStair.climbingStairMethod(1));
        System.out.println(ClimblingStair.climbingStairMethod(2));
        System.out.println(ClimblingStair.climbingStairMethod(4));
    }
}


//1+1+1=3
//2+1=3
//1+2=3

//1+1+1+1=4;
//2+2
//1+1+2
//2+1+1
//1+2+1

