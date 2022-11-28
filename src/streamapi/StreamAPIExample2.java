package streamapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 4,7,11,13, 20, 6, 22);
        List<Integer> listEven = new ArrayList<>();
        List<Integer>newList=list.stream().filter(i->i%2==0).collect(Collectors.toList());

    }
}
