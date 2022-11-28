package collections;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[]args)
    {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        //set index 2 value to 200
        System.out.println("set index 2 value:>"+al.set(1,200));
        System.out.println("size of arraylist:"+al.size());
        System.out.println("is arraylist empty?:"+al.isEmpty());
        if (al.contains(90))
        {
            System.out.println("ArrayList contains 90");
        }
        else {
            System.out.println("ArrayList doesn't contains 90");

        }
        System.out.println("the elements are:>");
        for (int i:al)
        {
            System.out.println(i);
        }
    }
}
