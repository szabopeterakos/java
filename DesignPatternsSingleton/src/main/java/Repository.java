
import java.beans.Customizer;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

//Singleton
public class Repository {

    private long repoID;
    private Set<Consumer> consumerListbyID = new TreeSet<>();
    static final Repository ONEREPO = new Repository(888717);

    private Repository(long repoID) {
        this.repoID = repoID;
    }

    public void addConsumer(Consumer c) {
        if (c == null) {
            throw new NullPointerException("Consumer must exist: " + c);
        }

        consumerListbyID.add(c);
    }

    //Template Method samlpe
    public List<Consumer> findByName(String name) {
        if (name == null || name.length() == 0) {
            throw new NullPointerException("Name must exist: " + name);
        }

        List<Consumer> out = new ArrayList<>();

        for (Consumer c : consumerListbyID) {
            if (c.getName().equals(name)) {
                out.add(c);
            }
        }

        if (out.size() == 0) {
            throw new IllegalArgumentException("No agreement in the consumerlist, name not found: " + name);
        }

        return out;
    }

    // concrete Template Method
    public List<Consumer> findBy(CriteriaCunsumer criteria) {

        List<Consumer> out = new ArrayList<>();

        for (Consumer c : consumerListbyID) {
            if (criteria.accept(c)) {
                out.add(c);
            }
        }

        return out;
    }

    public String averageByinginString(Consumer consumer) {
        return MinutesToStringDate(averageBuying(consumer));
    }

    public long averageBuying(Consumer consumer) {
        long currentminA = 0;
        long currentminB = 0;
        long sum = 0;
        long avg = 0;
        int counter = 0;

        for (Map.Entry<LocalDateTime, Map<String, Integer>> currentDate :
                consumer.getCunsumeListByDateTime().entrySet()) {
            currentminA = currentDate.getKey().getDayOfYear() * 1440;

            if (counter == 0) {
                currentminB = currentminA;
                currentminA = 0;
            } else {

                sum += Math.abs(currentminB - currentminA);
            }

            counter++;
        }

        avg = new BigDecimal(sum).divide(new BigDecimal(consumer.getCunsumeListByDateTime().size() - 1)).longValue();

        return Math.abs(avg);
    }

    public String MinutesToStringDate(long min) {

        long months = 0;
        long days = 0;
        long hours = 0;
        long minutes = 0;
        long sum = min;

        if (sum >= 43829) {
            months = sum / 43829;
            sum = months % 43829;
        }

        if (sum >= 1440) {
            days = sum / 1440;
            sum = days % 1440;
        }
        if (sum >= 60) {
            hours = sum / 60;
            sum = hours % 60;
        }

        if (sum > 0) {
            minutes += sum;
        }

        String message = "The average is : " +
                months + " months," + days + " days," + hours + " hours," + minutes + " minutes";

        return message;
    }

    public static Repository getONEREPO() {
        return ONEREPO;
    }

    public int repoSize() {
        return ONEREPO.consumerListbyID.size();
    }
}
