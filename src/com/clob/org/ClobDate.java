package com.clob.org;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClobDate {

    public static void main(String[] args) throws ParseException {

        Date inputDate = null;
        System.out.println("args--"+args);
        if ( args.length == 0 ) {
            long currentDateTime = System.currentTimeMillis();
            inputDate = new Date(currentDateTime);
        } else {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            inputDate = dateFormat.parse(args[0]);
        }
        
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(inputDate.getTime());

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        if ( dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.TUESDAY || dayOfWeek == Calendar.WEDNESDAY || dayOfWeek == Calendar.THURSDAY
                || dayOfWeek == Calendar.FRIDAY ) {
            cal.add(Calendar.DATE, -1);
        } else if ( dayOfWeek == Calendar.SUNDAY ) {
            cal.add(Calendar.DATE, -2);
        } else if ( dayOfWeek == Calendar.MONDAY ) {
            cal.add(Calendar.DATE, -3);
        }

        int month = cal.get(Calendar.MONTH) + 1;

        System.out.println("COB date is--" + cal.get(Calendar.YEAR) + "" + month + "" + cal.get(Calendar.DAY_OF_MONTH));
    }
}
