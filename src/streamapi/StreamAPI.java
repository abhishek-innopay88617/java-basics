package streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 4,7,11,13, 20, 6, 22);
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list
        ) {
            if (i % 2 == 0) {          //checks for even
                listEven.add(i);  //adds even no to listEven

            }

        }
        System.out.println("this is list:"+list);
        System.out.println("tihs is even list:"+listEven);
    }
}
