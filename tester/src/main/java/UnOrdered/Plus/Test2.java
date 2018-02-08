package UnOrdered.Plus;

public class Test2 {

    public final void kk() {
    }

    public static void main(String[] args) {

        Object o = null;
        o.toString();

    }

}

class t extends Test2 {
    public static void main(String[] args) {
        t tt = new t();
        tt.kk();
        try {

        }catch (NullPointerException e){
            throw e;
        }
    }
}
