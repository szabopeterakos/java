public class CriteriaByID implements CriteriaCunsumer {

    private int ID;

    public CriteriaByID(int id) {
        ID = id;
    }

    @Override
    public boolean accept(Consumer c) {
        if (c == null) {
            throw new NullPointerException("Customer must exist!");
        }

        return this.ID == c.getID();
    }
}
