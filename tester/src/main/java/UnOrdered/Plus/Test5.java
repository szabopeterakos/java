package UnOrdered.Plus;

public class Test5 {


    public static void main(String[] args) throws Exception {
        int i2 = 1, j2 = 10;
        do {
            if (i2++ > --j2) continue;
        } while (i2 < 5);
        System.out.println("i=" + i2 + " j=" + j2);


        String mStr = "123";
        long m = Long.parseLong(mStr);
        long m2 = Long.valueOf(mStr).longValue();
        long m3 = new Long("123");
        System.out.println(m3);
        int i1 = new Integer("33");
        System.out.println(i1);


        //What will be the result of attempting to compile and run the following class?public class TestClass {

        int i, j, k;
        i = j = k = 9;
        System.out.println(i);

    }

}


