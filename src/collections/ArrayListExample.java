package collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("RAM");
        names.add("SITA");
        names.add("RAVAN");
        names.add("DIVYA");
        names.add("LAXMI");
        System.out.println(names);
        System.out.println("element at 0 index:"+names.get(0));   //at index 0
        System.out.println("element at 2 index:"+names.get(2)); //at index 2
        System.out.println("does array contains sita?:"+names.contains("SITA")); //returns true or false based on value is present or not
        System.out.println("size of the array is:"+names.size());    //returns size of the array
        System.out.println("is array empty?:"+names.isEmpty()); //true if array is empty else false
    }
}
