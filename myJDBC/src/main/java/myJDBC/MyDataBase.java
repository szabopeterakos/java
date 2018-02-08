package myJDBC;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyDataBase {

    private final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private final String URL = "jdbc:derby:sampleDB;create=true"; // jdbc : derbit használunk majd, ilyen néven keresd, ha nincs hozz létre egyet
    private final String USER = "admin";
    private final String PASSWORD = "admin";

    private Connection connection = null;
    private Statement statement = null;
    private DatabaseMetaData databaseMetaData = null;
    private ResultSet rs = null;


    public MyDataBase() {

        // Connection abstrakt de a DriverManager.getConnection visszaadja már a megfelelő implementciót, egy hidat
        // a hid egyik oldala a connection maga, a másik meg a getConnection paraméterei.

        try {
            connection = DriverManager.getConnection(URL); // url , user, pass
            System.out.println("my connection ok"); // check the database it valid and useable
        } catch (SQLException e) {
            e.printStackTrace();
            Logger.getLogger(MyDataBase.class.getName()).log(Level.SEVERE, null, e); //popup ablak
            System.out.println("" + e);
        }

        // egy utasitás, kérés, meta adat vagy konkrét adat.
        // egy statment szállitja a kéréseket

        if (connection != null) {
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        // check hogy üres e az adatbázis

        // 1. elkeri a metaadatokat
        try {
            databaseMetaData = connection.getMetaData();
        } catch (SQLException e) {
            System.out.println(e);
        }

        // 2. whiteboard amin visszaerkezik az az adattábla releváns másolata
        try {
            rs = databaseMetaData.getTables(null, "APP", "USERS", null);

            // 3. itt a check
            if (!rs.next()) { // hasnext , nincs elsö recordjase
                statement.execute("create table users(name varchar(50), address varchar(50))");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void addUser(String name, String address){
        try {
//            String sqlMessage = "insert into users (name,address) values ('"+name+"','"+ address +"')";
//            statement.execute(sqlMessage);


            String sqlMessagePrep = "insert into users (name,address) values ('?','?')";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlMessagePrep);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,address);
            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void showAllUsers(){

        try {
            String sqlQuery = "select * from users";
            rs = statement.executeQuery(sqlQuery);

            while(rs.next()){ // egzesével jönnek a rekordok át
                String cName = ""+rs.getString(1); // column name
                String cAddress = ""+rs.getString("address"); // column name
                System.out.println("Name: "+cName +" | Address: "+cAddress);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        System.out.println();
    }

    public void showMeta(){
        String sqlMeta = "select * from users";
        ResultSetMetaData rsmd = null;

        try {

            rs = statement.executeQuery(sqlMeta);
            rsmd = rs.getMetaData();
            int lengthOfTable = rsmd.getColumnCount();

            for (int i = 1; i <= lengthOfTable ; i++) {
                System.out.println(rsmd.getColumnName(i));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
