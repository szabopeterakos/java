package UnOrdered.Plus;

public class Test11 {


    public void initData(String[] arr) {
        int ind = 0;
        for (String str : arr) {
            str = str.concat(str + " " + ind);
            ind++;
        }
    }

    public void printData(String[] arr) {
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Test11 ot = new Test11();
        String[] arr = new String[2];
        ot.initData(arr);
        ot.printData(arr);
    }


}
