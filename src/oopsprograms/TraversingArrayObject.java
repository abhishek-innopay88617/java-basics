package oopsprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class TraversingArrayObject {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("RAM");
        names.add("SITA");
        names.add("RAVAN");
        names.add("DIVYA");
        names.add("LAXMI");
        //traversing over the arrays
        System.out.println(names);
        for (String s:names
             ) {
            System.out.println(s+"\t"+s.length());

        }
       //using iterator method
            System.out.println("---------using iterator-----------");
              Iterator<String> itr=names.iterator();
      while (itr.hasNext())
      {
          System.out.println(itr.next());
      }
    }
}
