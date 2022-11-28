package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            try {

                System.out.println("numerator:");
                int num = sc.nextInt();
                System.out.println("denominator:");
                int deno = sc.nextInt();
                int result = num / deno;
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("something wrong! denominator cannot be zero");
                   try {
                       System.out.println("one more chance");
                       System.out.println("numerator:");
                       int num= sc.nextInt();
                       System.out.println("denominator:");
                       int deno = sc.nextInt();
                       int result = num / deno;
                       System.out.println(result);
                   }
                   catch (Exception e1)
                   {
                       System.out.println("sorry");
                   }
            }
            finally {
                System.out.println("output is displayed");
            }
        }
    }
