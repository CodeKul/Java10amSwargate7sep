package polymorphism;

/**
 * Created by rajan on 28/9/17.
 */
public class MethodOverridding {

    public static void main(String[] args) {
        Rbi r=new Rbi();
        sbi s=new sbi();
        axis a=new axis();
        BoM b=new BoM();
        Bob bob=new Bob();

        System.out.println("rate of interest of rbi\t"+r.rateOfIntrest());
        System.out.println("rate of interest of sbi\t"+s.rateOfIntrest());
        System.out.println("rate of interest of axis\t"+a.rateOfIntrest());
        System.out.println("rate of interest of BoM\t"+b.rateOfIntrest());
        System.out.println("rate of interest of BoB\t"+bob.rateOfIntrest());

    }

}
class Rbi
{
    int rateOfIntrest()
    {
        return 7;
    }
}
class sbi extends Rbi
{
    int rateOfIntrest()
    {
        return 10;
    }
}
class axis extends Rbi
{
    int rateOfIntrest()
    {
        return 11;
    }
}
class BoM extends Rbi
{
    int rateOfIntrest()
    {
        return 14;
    }
}
class Bob extends Rbi
{
    int rateOfIntrest()
    {
        return 12;
    }
}
