package Encapsulation;

/**
 * Created by rajan on 5/10/17.
 */
public class getData {

    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo=new EncapsulationDemo();
        encapsulationDemo.setId(1);
        encapsulationDemo.setName("codekul");
        encapsulationDemo.setCity("pune");

        System.out.println(encapsulationDemo.getId());
        System.out.println(encapsulationDemo.getName());
        System.out.println(encapsulationDemo.getCity());
    }
}
