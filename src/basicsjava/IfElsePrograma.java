package basicsjava;

import java.util.Scanner;

public class IfElsePrograma {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age for voting validation:");
        int age= scan.nextInt();
        if (age<18)
        {
            System.out.println("Not eligible to vote");
        } else if (age>100) {
            System.out.println("you are too old");

        }
        else {
            System.out.println("congrats..you are eligible");
        }
    }
}
