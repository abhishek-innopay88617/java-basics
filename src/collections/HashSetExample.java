package collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Double> nms=new HashSet<>();
        nms.add(14.12);
        nms.add(10.10);
        nms.add(14.12);    //duplicates not allowed
        System.out.println(nms);       //order is not preserved
                                       //index is not allowed
    }
}
