
package Lesson11Recursion;


public class Fibonaccii {

    static long count =0;
    public static void main(String[] args) {
        System.out.println("The 8th fib is " + fib1(8));
        System.out.println("The 8th fib(recursive) is " + recfib(8));
        System.out.format("Recfib was called a total of %d times",count);
    }
    
    public static int recfib(int num){
        count++;
        if(num==1 || num==2) return 1;
        else
            return recfib(num-1) + recfib(num-2);
    }
    
    public static  int fib1(int num){
        if(num==1 || num==2) return 1;
        int num1 =1,num2=2;
        int fib =0;
        for (int i = 3; i <= num; i++) {
            fib = num1+num2;
            num1 = num2;
            num2 = fib;
        }
        return fib;
    }
    
}
