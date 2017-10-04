package Keywords;

/**
 * Created by rajan on 25/9/17.
 */
public class StaticKey {

    int a;
    //static variable
    static int rollNumber=1;
    static String StudentName="vasu";
    static String institue = "codekul";

    StaticKey(int id, String name) {
        rollNumber = id;
        StudentName = name;
    }

    //static method
    static void display() {
           System.out.println("id : " + rollNumber + "\t" +
                   "name : " + StudentName + "\t" +
                   "institue : " + institue);
        System.out.println("in display method : "+StudentName.hashCode()+"\t"+StudentName);

    }
    void show()
    {

        get();
    }

    void get()
    {

    }

    //static block


    public static void main(String[] args) {

        StaticKey staticKey = new StaticKey(1, "vasu");
        StaticKey staticKey1 = new StaticKey(2, "Pooja");
        System.out.println(institue.hashCode());
        System.out.println("in main method : "+StudentName.hashCode()+"\t"+StudentName);
        StaticKey.display();
    }
    static
    {
        System.out.println("hello sonal");
    }
    static {
//        StaticKey.display();
//        System.out.println("in ststic block");
//        System.out.println(institue.hashCode());
//        System.out.println("in static  block : "+StudentName.hashCode()+"\t"+StudentName);
        System.out.println("hello smita");
    }

}
