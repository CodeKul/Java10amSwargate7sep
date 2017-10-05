package Encapsulation;

/**
 * Created by rajan on 5/10/17.
 */
public class EncapsulationDemo {

    int id;
    String name;
    String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "EncapsulationDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo=new EncapsulationDemo();
        encapsulationDemo.setId(1);
        encapsulationDemo.setName("vasu");
        encapsulationDemo.setCity("Rajkot");

    }
}

