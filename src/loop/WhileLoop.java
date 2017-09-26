package loop;

/**
 * Created by rajan on 18/9/17.
 */
public class WhileLoop {

  int j=0;
  void  show()
    {
       do
        {

            System.out.println("codekul");
            j++;
        }while (j<10);
    }

    public static void main(String[] args) {
        WhileLoop whileLoop=new WhileLoop();
        whileLoop.show();

    }
}
