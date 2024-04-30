package Fibonacci;
import java.util.Scanner;

public class fibonacci {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);

    }



    public static void main(String[]Args){
        Scanner inp = new Scanner(System.in);
        System.out.println(fib(7));
    }
}

