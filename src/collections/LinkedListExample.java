package collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        //all type of data is stored
        list.add("ram");
        list.add(123);
        list.add(10.2);
        list.add('a');
        list.add(true);
        System.out.println(list);

    }
}
