package company;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("pp.properties"));
            System.out.println("test" + properties.getProperty("test"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
