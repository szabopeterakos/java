package myJDBC;

public class FirstConnection {

    public static void main(String[] args) {
        MyDataBase db = new MyDataBase();
        db.addUser("laci","kaposvár");
        db.showAllUsers();
        db.showMeta();
    }

}
