
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            //properties.load(new FileInputStream("pp.properties"));
            InputStream inputStream = ClassLoader.getSystemResourceAsStream("pp.properties");
            properties.load(inputStream);

            System.out.println(properties.getProperty("gabi"));
            //System.out.println(properties.setProperty("peti","2233"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
