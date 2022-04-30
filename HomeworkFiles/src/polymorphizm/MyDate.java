package polymorphizm;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;

public class MyDate {
    private static long year;
    private static long month;
    private static long day;

    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    public MyDate(){

        year = gregorianCalendar.get(gregorianCalendar.YEAR);
        month = gregorianCalendar.get(gregorianCalendar.MONTH);
        day =gregorianCalendar.get(gregorianCalendar.DATE);

    }

    public MyDate(long ellapsedTime){
        gregorianCalendar.setTimeInMillis(ellapsedTime);
        year = gregorianCalendar.get(gregorianCalendar.YEAR);
        month = gregorianCalendar.get(gregorianCalendar.MONTH);
        day =gregorianCalendar.get(gregorianCalendar.DATE);
    }

    public MyDate(long year, long month, long day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public long getYear(){
        return year;
    }
    public  long getMonth(){
        return month;
    }
    public long getDay(){
        return day;
    }
    public void setDate(long ellapsedTime){
        gregorianCalendar.setTimeInMillis(ellapsedTime);
        year = gregorianCalendar.get(gregorianCalendar.YEAR);
        month = gregorianCalendar.get(gregorianCalendar.MONTH);
        day =gregorianCalendar.get(gregorianCalendar.DATE);
    }
}
