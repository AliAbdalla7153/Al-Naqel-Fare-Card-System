package inheritance;

public class ThrowExceptionDemo {
    public static void main(String[] args) {


         try {
              add(2,0);
           } catch (Exception e) {
               e.printStackTrace();
               System.out.println("not possible to divide by zero");
          }


    }

    public static int add(int a,int b) throws ArithmeticException {
        return a/b;

    }
}
