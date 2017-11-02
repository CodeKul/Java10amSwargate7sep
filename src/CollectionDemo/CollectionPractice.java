package CollectionDemo;

import java.util.*;

/**
 * Created by rajan on 12/10/17.
 */
public class CollectionPractice {

static String a;
    public static void main(String[] args) {

        final byte a=20;
        final byte b=4;
        final byte c=a+b;
        System.out.println(c);

        System.out.println("LIST :\n ");
        List<String> list=new ArrayList<>();
        list.add("vasu");
        list.add("pooja");
        list.add("pradnya");
        list.add("hayat");
        list.add("soooooonali");
        list.add("vasu");
        list.add("hayat");
        list.add("pooja");

        for (String s:list)
        {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("SET :\n ");
        Set<String> set=new TreeSet<>();
//        set.add("vasu");
//        set.add("pooja");
//        set.add("pradnya");
//        set.add("hayat");
//        set.add("soooooonali");
        set.addAll(list);


        for (String s:set)
        {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("HASHSET :\n ");
        Set<String> hashSet=new HashSet<>();
//        hashSet.add("vasu");
//        hashSet.add("pooja");
//        hashSet.add("pradnya");
//        hashSet.add("hayat");
//        hashSet.add("soooooonali");
        hashSet.addAll(set);


        for (String s:hashSet)
        {
            System.out.println(s);
        }
    }
}
