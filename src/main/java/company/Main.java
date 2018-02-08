package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = "sdfg jkjhg dfdf df df df df f ghjhj gesrdt ikk 6 fghj uuu 7.7 poh ";

        System.out.println("teszt");

        for(conditions c : conditions.values()){
            System.out.println(c.toString() + " " + c.getCondition_quality());
        }

        List<String> stringList = new ArrayList<>();
        Scanner in = new Scanner(str);


        while (in.hasNext()){
            String temp = in.next();
            stringList.add(temp);
        }

        System.out.println("list : "+stringList);
        System.out.println(stringList.size());

    }
}
