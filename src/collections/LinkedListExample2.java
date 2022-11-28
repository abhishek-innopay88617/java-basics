package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[]args){
        LinkedList<String> ll=new LinkedList<>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        System.out.println("linked list elements are:");
        for (String s:ll)
        {
            System.out.println(s);
        }


        System.out.println("linked list elements after change:");
        System.out.println("element at 2 inddex"+ll.get(2));
        ll.addLast("z");
        for (String s:ll)
        {
            System.out.println(s);
        }
        //this is using iterator function
        System.out.println("this is using iterator function");
        Iterator<String> it=ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
