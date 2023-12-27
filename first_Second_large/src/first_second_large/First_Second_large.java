package first_second_large;

import java.lang.invoke.LambdaMetafactory;
import java.util.Scanner;

public class First_Second_large {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        if (N % 2 == 0) {
            System.out.println("Weird");
        } else if(N % 2 ==0  && 2>=5) {
            System.out.println(" Not Weird ");
        } else if(N % 2 ==0  && 6>=20) {
            System.out.println(" Weird ");
        } 
        else {
            System.out.println("Not Weird");
        }

    }
}
