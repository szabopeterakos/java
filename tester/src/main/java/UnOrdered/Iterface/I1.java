package UnOrdered.Iterface;

public interface I1 {
    public static final int INTCONSTANT_PSF = 333;

    default boolean DefaultMethod() {
        StaticMethod();

        return true;
    }

    static boolean StaticMethod() {
        return false;
    }

    int Method();

}
