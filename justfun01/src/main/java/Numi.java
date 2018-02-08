public enum Numi {

    N(1),U(2),M(3),I(4);

    private final int value;

    private Numi(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
