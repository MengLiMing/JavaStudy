package com.study.day2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(1520017383000L);
        Date date2 = new Date(1520324421000L);

        System.out.println(date1.toString());
        System.out.println(date2.toString());

        System.out.println(date2.after(date1));

        System.out.println(date1.getTime());


        System.out.println(date1.toString());


        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' HH:mm:ss a zzz");
        System.out.println("Current Date：" + ft.format(dNow));

        System.out.printf("全部日期和时间信息：%tc%n",dNow);


        Calendar c1 = Calendar.getInstance();
        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH) + 1;
        int date = c1.get(Calendar.DATE);
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        int minute = c1.get(Calendar.MINUTE);
        int second = c1.get(Calendar.SECOND);
        int day = c1.get(Calendar.DAY_OF_WEEK);

        System.out.println("年：" + year + "月：" + month + "日：" + date + "小时：" + hour + "分钟：" + minute + "秒：" + second + "星期：" + day);


        GregorianCalendar gcalendar = new GregorianCalendar();
        System.out.println(gcalendar.get(Calendar.MONTH));
        System.out.println(Calendar.MONTH);
        System.out.println(year = gcalendar.get(Calendar.YEAR));

    }
}
