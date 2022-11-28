package collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String>stateCity=new HashMap<>();
        stateCity.put("karnataka","Bengalore");
        stateCity.put("Andrapradesh","hyd");
        stateCity.put("Odissa","Bhubaneshwar");
        System.out.println(stateCity);
       System.out.println(stateCity.get("Odissa"));
    }
}
