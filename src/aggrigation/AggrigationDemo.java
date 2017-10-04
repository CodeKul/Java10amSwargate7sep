package aggrigation;

/**
 * Created by rajan on 27/9/17.
 */
public class AggrigationDemo {

    int id;
    String name;


    AggrigationDemo(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void showData()
    {
        System.out.println(id);
        System.out.println(name);
    }
}

class AgrrigationSecondDemo
{
    String address;
    String state;

    AgrrigationSecondDemo(String address,String state)
    {
        this.address=address;
        this.state=state;
    }
}


class Student
{
    String city;
    int zipCode;
    AggrigationDemo aggrigationDemo;
    AgrrigationSecondDemo agrrigationSecondDemo;

    Student(String city,int zipCode,AggrigationDemo aggrigationDemo,AgrrigationSecondDemo agrrigationSecondDemo)
    {
        this.city=city;
        this.zipCode=zipCode;
        this.aggrigationDemo=aggrigationDemo;
        this.agrrigationSecondDemo=agrrigationSecondDemo;
    }
    void display()
    {
        System.out.println("id : "
                +aggrigationDemo.id+"\t"+"name : "+aggrigationDemo.name+"city : "+city+"\t"+"zipcode : "+zipCode+"\t");
        System.out.println("address : "+agrrigationSecondDemo.address+"\t"+"state : "+agrrigationSecondDemo.state);

    }

    public static void main(String[] args) {
        AggrigationDemo aggrigationDemo=new AggrigationDemo(1,"sonal");
        AgrrigationSecondDemo a=new AgrrigationSecondDemo("warje","Maharashtra");
        Student student=new Student("pune",411052,aggrigationDemo,a);
        student.display();
    }

}
