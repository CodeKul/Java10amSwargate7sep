import java.util.*;

/**
 * Created by rajan on 4/10/17.
 */
public class CollectionDemo {
    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        System.out.println(map);
        map.remove(100);
        System.out.println(map);



//        for (Map.Entry m : map.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());


//        List<String> list=new ArrayList<>();
//        list.add("pooja");
//        list.add("rajan");
//        list.add("rohan");
//        list.add("pooja");
//
//        Set<String> set=new TreeSet<>();
//
////        set.add("pooja");
////        set.add("rajan");
////        set.add("rohan");
////        set.add("pooja");
//        set.addAll(list);
//
//
//        for (String s : set)
//        {
//            System.out.println(s);
//        }
        }
    }

