package basicsjava;
import java.util.*;

public class ForLoopProgram {
    public static void main(String[] args) {
        int count=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value For n stars:");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        System.out.println("enter the num value for even numbers:");
        int num = scan.nextInt();
        System.out.println("even numbers between"+" "+"1"+" "+"to "+num);
        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("total even numbers are"+" "+count);
    }
}
