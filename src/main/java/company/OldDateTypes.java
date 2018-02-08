package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OldDateTypes {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(System.currentTimeMillis());

        Date d2 = new Date();
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
        DateFormat df1 = new SimpleDateFormat("yyyyMMdd");
        DateFormat df2 = new SimpleDateFormat("yy<>MM<>dd");
        DateFormat df3 = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss.");
        System.out.println(df.format(d2));
        System.out.println(df1.format(d2));
        System.out.println(df2.format(d2));
        System.out.println(df3.format(d2));

        Date d3 = new Date(System.currentTimeMillis());
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(d3));
    }

}
