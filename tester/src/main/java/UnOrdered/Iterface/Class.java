package UnOrdered.Iterface;

public class Class implements I1 {
    private int objectvalue = INTCONSTANT_PSF;

    @Override
    public int Method() {
        return 0;
    }

    public static void main(String[] args) {
        Class cc = new Class();
        System.out.println(INTCONSTANT_PSF);
        System.out.println(new Class().objectvalue);
        System.out.println(INTCONSTANT_PSF == new Class().objectvalue);
        cc.objectvalue = 44;
        System.out.println(cc.objectvalue);
        System.out.println(cc.Method());
        System.out.println(cc.DefaultMethod());

    }
}
