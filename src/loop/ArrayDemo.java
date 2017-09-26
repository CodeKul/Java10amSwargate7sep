package loop;

/**
 * Created by rajan on 18/9/17.
 */
public class ArrayDemo {

    void oneDArray()
    {
        int array[]={1,2,3,4,5};
        for (int i=0;i<5;i++)
        {
            System.out.println(array[i]);
        }
    }
    void twoDArray()
    {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++) {

                    System.out.print("\t" + array[i][j]);


                }
            System.out.println("");
            }


    }



    public static void main(String[] args) {
        ArrayDemo arrayDemo=new ArrayDemo();
        System.out.println("output of 1-D array : ");
        arrayDemo.oneDArray();
        System.out.println("output of 2-D array : ");
        arrayDemo.twoDArray();

    }

}
