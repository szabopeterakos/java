public class CriteriaName implements CriteriaCunsumer {

    private String name;

    public CriteriaName(String name) {
        this.name = name;
    }

    @Override
    public boolean accept(Consumer c) {
        if (c.getName() == null || name.length() == 0) {
            throw new NullPointerException("Name must exist: " + name);
        }

        return this.name.equals(c.getName());
    }
}
