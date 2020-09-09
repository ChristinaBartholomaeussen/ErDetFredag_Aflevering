package com.example.Sevices;

import java.util.Calendar;
import java.util.Date;

public class ErDetFredag {



public ErDetFredag(){}



public int retunerSvar()
{

    Date today = new Date();
    Calendar cal = Calendar.getInstance();
    cal.setTime(today);

    int q = cal.get(Calendar.DAY_OF_MONTH);

    int j = cal.get(Calendar.YEAR)/100;

    int k = cal.get(Calendar.YEAR)%100;


    int m = cal.get(Calendar.MONTH)+1;

    if(m == 1)
    {
        cal.set(Calendar.MONTH, 13);
    }
    if(m == 2)
    {
        cal.set(Calendar.MONTH, 14);
    }

    double h = (q + Math.floor((13*(m+1))/5) + k + Math.floor(k/4) + Math.floor(j/4) - (2*j)) % 7;

    int h1 = (int)h;

    double d = (((h1+5)%7)+1);

    int d1 = (int)d;

    return d1;

}



}
