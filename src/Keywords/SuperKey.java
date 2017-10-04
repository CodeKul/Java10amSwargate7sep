package Keywords;

/**
 * Created by rajan on 28/9/17.
 */
public class SuperKey {

    String name = "codekul";
    SuperKey()
    {
        System.out.println("in parent constructor");
    }

    void show()
    {
        System.out.println(name);
    }

}
class childSuper extends SuperKey
{
    String name ="melayer";

    childSuper()
    {

        System.out.println("in child constructor");
    }
    void show()
    {
        System.out.println(name);
        super.show();
        //System.out.println(super.name);
    }

    public static void main(String[] args) {
        childSuper c=new childSuper();
        //c.show();
    }
}
