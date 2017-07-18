package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Util {

    public static String dateToString (Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(date);
    }


    public static Date dateParser(String dateInString) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = formatter.parse(dateInString);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static java.sql.Date sqlDateParser(Date utilDate) {

        return new java.sql.Date(utilDate.getTime());
    }


    public static Date utilDateParser(java.sql.Date sqlDate) {
        return new Date(sqlDate.getTime());
    }

}
