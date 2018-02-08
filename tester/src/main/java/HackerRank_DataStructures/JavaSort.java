package HackerRank_DataStructures;

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner("5\n" +
                "33 Rumpa 3.68\n" +
                "85 Ashis 3.75\n" +
                "56 Ashis 3.75\n" +
                "19 Samara 3.75\n" +
                "22 Fahim 3.76");
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = Double.parseDouble(in.next());

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o2.getCgpa() != o1.getCgpa()) {
                    return (int) (o2.getCgpa() * 1000 - o1.getCgpa() * 1000);
                } else {
                    if (!o1.getFname().equals(o2.getFname())) {
                        return o1.getFname().compareTo(o2.getFname());
                    } else {
                        return o1.getId() - o2.getId();
                    }
                }
            }
        });

        for (Student st : studentList) {
            System.out.println(st.getFname() + " "+st.getId());
        }
    }
}
