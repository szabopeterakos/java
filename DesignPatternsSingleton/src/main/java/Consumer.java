import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Consumer implements Comparable<Consumer> {

    private String name;
    private int ID;
    private Map<LocalDateTime, Map<String, Integer>> cunsumeListByDateTime = new HashMap<>();

    public Consumer(String name, int ID, Map<LocalDateTime, Map<String, Integer>> cunsumeListByDateTime) {
        this.name = name;
        this.ID = ID;
        this.cunsumeListByDateTime = cunsumeListByDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Map<LocalDateTime, Map<String, Integer>> getCunsumeListByDateTime() {
        return cunsumeListByDateTime;
    }

    public void setCunsumeListByDateTime(Map<LocalDateTime, Map<String, Integer>> cunsumeListByDateTime) {
        this.cunsumeListByDateTime = cunsumeListByDateTime;
    }


    @Override
    public String toString() {
        return " ||ID: " + ID + "| Name: " + name + " | Listed : " + getCunsumeListByDateTime().size() + " shopping event";
    }

    @Override
    public int compareTo(Consumer o) {
        return this.ID - o.ID;
    }

}
