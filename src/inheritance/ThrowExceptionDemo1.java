package inheritance;

public class ThrowExceptionDemo1 {
    public static void main(String[] args) {

         try {
            setRadius(3);
        }
        catch (IllegalArgumentException il){
            System.out.println("exception caught"+il);
        }

        catch (Exception e){
            System.out.println(e);
        }

        finally {
            System.out.println("this is finally ");
        }

        int i =3+6;
        System.out.println(i);

    }

    public static void setRadius(int i) throws Exception  {



        if (i == 0) {
            throw new IllegalArgumentException("This is illegal argument");
        }
        else {
            throw new Exception("this is general exception");
        }

    }
    }

