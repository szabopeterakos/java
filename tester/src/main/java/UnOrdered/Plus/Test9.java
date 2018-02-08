package UnOrdered.Plus;

class Other { public static String hello = "Hello"; }

public class Test9 {


        public static void main(String[] args){
            String hello = "Hello", lo = "lo";
            System.out.print((Other.hello == hello) + " ");    //line 1
            System.out.print((Other.hello == hello) + " ");   //line 2
            System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
            System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
            System.out.println(hello == ("Hel"+lo).intern());          //line 5
        }




}
