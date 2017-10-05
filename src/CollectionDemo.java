import java.util.*;

/**
 * Created by rajan on 4/10/17.
 */
public class CollectionDemo {
    public static void main(String[] args) {


        List<String> list=new ArrayList<>();
        list.add("pooja");
        list.add("rajan");
        list.add("rohan");
        list.add("pooja");

        Set<String> set=new TreeSet<>();

//        set.add("pooja");
//        set.add("rajan");
//        set.add("rohan");
//        set.add("pooja");
        set.addAll(list);


        for (String s : set)
        {
            System.out.println(s);
        }
    }
}
