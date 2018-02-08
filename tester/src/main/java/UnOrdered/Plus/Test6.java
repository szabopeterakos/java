package UnOrdered.Plus;


public class Test6 {
    //HR_Algorithms_String s = 'd';

    public void switchString(String input) {
        switch (input) {
            case "a":
                System.out.println("apple");
            case "b":
                System.out.println("bat");
                break;
            case "B":
                System.out.println("big bat");
            default:
                System.out.println("none");
        }
    }

    public static void main(String[] args) throws Exception {
        Test6 tc = new Test6();
        tc.switchString("B");


        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};
        String newStr = null;
        for (char ch : myCharArr) {
            newStr = newStr + ch;
        }
        System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));
        System.out.println(newStr);


    }


}
    

