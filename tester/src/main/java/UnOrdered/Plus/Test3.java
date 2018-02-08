package UnOrdered.Plus;

import java.util.List;

public abstract class Test3 {

    public static void main(String[] args) {

        System.out.println("START\n");

        String v = null;

        try {
            try {
                System.out.println("before");
                v.length();
                System.out.println("after");
            } catch (NullPointerException npe) {
                System.out.println("catch");
                throw new RuntimeException(); // le van szarva
            } finally {
                System.out.println("finally");
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("done");
        }

        System.out.println("\nEND");

        //System.out.println(Integer.parseInt("tomi"));
        //System.out.println(0/2);
        //System.out.println(2/0);

        try {
            hop();
        } catch (Exception e){
            //System.out.println(e);
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    private static void hop(){
        throw new RuntimeException("Hooters");
    }
}
