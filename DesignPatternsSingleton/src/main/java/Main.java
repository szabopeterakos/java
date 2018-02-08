import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //initialize consumer
        Map<LocalDateTime, Map<String, Integer>> consumerBuy = new HashMap<>();

        Map<String, Integer> listBuy1 = new HashMap<>();
        listBuy1.put("onion", 132);
        listBuy1.put("milk", 300);
        listBuy1.put("sugar", 600);
        listBuy1.put("cake", 2990);

        Map<String, Integer> listBuy2 = new HashMap<>();
        listBuy2.put("bread", 255);

        Map<String, Integer> listBuy3 = new HashMap<>();
        listBuy3.put("surprise", 10990);

        consumerBuy.put(LocalDateTime.of(2017, 1, 3, 11, 33), listBuy1);
        consumerBuy.put(LocalDateTime.of(2017, 1, 13, 11, 33), listBuy2);
        consumerBuy.put(LocalDateTime.of(2017, 1, 23, 11, 33), listBuy3);

        // a consumer and a repository
        Consumer consumer1 = new Consumer("John Snow", 10009, consumerBuy);
        Consumer consumer2 = new Consumer("John Snow", 10009, consumerBuy);
        Consumer consumer3 = new Consumer("John Snow", 10003, consumerBuy);
        Consumer consumer4 = new Consumer("Steven Sontheim", 10002, consumerBuy);
        Repository TestRepository = Repository.getONEREPO();

        // test
        TestRepository.addConsumer(consumer1);
        TestRepository.addConsumer(consumer2);
        TestRepository.addConsumer(consumer3);
        TestRepository.addConsumer(consumer4);
        System.out.println(TestRepository.findByName("John Snow"));
        System.out.println(TestRepository.repoSize());
        System.out.println(TestRepository.findBy(new CriteriaName("Steven Sontheim")));
        System.out.println(TestRepository.findBy(new CriteriaByID(10009)));

        //Test average buy
        System.out.println(TestRepository.averageBuying(TestRepository.findBy(new CriteriaByID(10003)).get(0)));

        // average in string
        System.out.println(TestRepository.MinutesToStringDate(TestRepository.averageBuying(TestRepository.findBy(new CriteriaByID(10003)).get(0))));
        System.out.println(TestRepository.averageByinginString(TestRepository.findBy(new CriteriaName("Steven Sontheim")).get(0)));
    }

}
