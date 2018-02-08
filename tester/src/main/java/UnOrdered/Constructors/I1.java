package UnOrdered.Constructors;

public interface I1 {

    int MAX = 200;

    static int kiki() {
        return 0;
    }

    ;

}

interface I2 {

    int MAX = 111;

    static int kiki() {
        return 13;
    }

    ;

}

class niki implements I1, I2 {
    static String kiki() {
        return "";
    }

    public static void main(String[] args) {
        I1.kiki();
    }
}
