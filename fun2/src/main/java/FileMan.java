import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMan {

    private int size;
    private String name;

    @Override
    public String toString() {
        return "FileMan{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        File f = new File("fileman.man");

        //Security checking
        if(f.exists()){
            System.out.println("Is exists : "+ f.exists());
            System.out.println("Is Execute allow : " + f.canExecute());
            System.out.println("Is Write allow : " + f.canWrite());
            System.out.println("Is Read allow : " + f.canRead());
        }

        //write initialize
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f));
            for (int i = 0; i < 300; i++) {
                if(i%4==0){
                    bufferedWriter.write(i+" ");
                }
            }
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //WRITE
        try(PrintWriter pr = new PrintWriter(new BufferedWriter(new FileWriter(f)))){
            pr.println("nice");
            pr.format("This will be good number %d huh? \n",777);
            pr.println(new FileMan());
            pr.println(new FileMan());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //READ
        try (BufferedReader  bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(f),"UTF-8"))){
            String s;
            while((s=bufferedReader.readLine())!=null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //NIO the new an nonblocking in and out
        Path p = Paths.get("fileman.man");
        System.out.println(p.getFileName());
        System.out.println(p);


    }

}
