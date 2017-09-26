package Keywords;

/**
 * Created by rajan on 26/9/17.
 */
public class ThisKey {

    int id;
    String name;

    ThisKey()
    {
        this(1,"codekul");
        System.out.println("in default constructor");
    }

    ThisKey(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void show(ThisKey t)
    {
        System.out.println("id : "+id+"\t"+"name : "+name);
    }
    void get()
    {
       show(this);
    }

    public static void main(String[] args) {
        ThisKey thisKey=new ThisKey();
        thisKey.get();
    }
}
