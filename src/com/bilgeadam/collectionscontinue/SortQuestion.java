package com.bilgeadam.collectionscontinue;

import java.text.Collator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SortQuestion {
    public static void main(String[] args) throws ParseException {
        List<String> countyList = new ArrayList<>();
        countyList.add("Beşiktaş");
        countyList.add("Adalar");
        countyList.add("Üsküdar");
        countyList.add("Çatalca");

        Collections.sort(countyList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Collator collator = Collator.getInstance(new Locale("tr","TR"));
                return collator.compare(o1,o2);
            }
        });
        for (String s:countyList) {
            System.out.println(s);

        }
        //Date() doğum günleri
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd.MM.yyyy");
        Date date1 =  simpleDateFormat.parse("01.01.1992");
        Date date2 = simpleDateFormat.parse("05.04.1989");
        Date date3 = simpleDateFormat.parse("02.05.1996");
        Date date4 = simpleDateFormat.parse("07.07.1987");
        Date date5 = simpleDateFormat.parse("23.02.1983");

        List<Date> listBirthDay = Arrays.asList(date1,date2,date3,date4,date5);
        Collections.sort(listBirthDay, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                if(o1.getTime() < o2.getTime()){
                    return -1;
                }else if(o1.getTime() > o2.getTime()){
                    return 1;
                }
                return 0;
            }
        });
        for (Date d:listBirthDay) {
            System.out.println(d);
        }
    }
}

