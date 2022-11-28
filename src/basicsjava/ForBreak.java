package basicsjava;

public class ForBreak {
    public static void main(String[]args)
    {
        for (int i=1; i<=10; i++){
            if (i==5){
                System.out.println("caught i==5 remaining numbers will not print");
                break;
            }
            System.out.println(i);
        }
    }
}
