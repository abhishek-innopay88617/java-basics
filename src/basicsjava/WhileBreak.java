package basicsjava;

public class WhileBreak {
    public static void main(String[]args)
    {
        int i=1;    //starts from 1
        while (i<=10)   //upto 10
        {
            if (i==5){       //if its true break the loop dont print remaining values
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
