package UnOrdered.Plus;


import java.util.ArrayList;
import java.util.List;

public class Test26 implements IInt {
    public static void main(String[] args) {
        Test26 s = new Test26();  //1
        int j = s.thevalue;       //2
        int k = IInt.thevalue;    //3
        int l = thevalue;         //4

        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(1,77);
        list.add(0,0);
        System.out.println(list);

    }
}

interface IInt {
    public static final int thevalue = 0;

    public default int cal() {
        return 1;
    }


}


