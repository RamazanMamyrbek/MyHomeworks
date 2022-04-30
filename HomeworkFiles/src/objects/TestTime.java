package objects;

public class TestTime {
    public static void main(String[] args){
        Time time1 = new Time();

        System.out.println("Hour = " + time1.getHour() + "\tMinute = " + time1.getMinute() + "\t Second = " + time1.getSecond() + " for UTC; (UTC+6 == Almaty)");
        time1.setTime(555550000);
        System.out.println("Hour = " + time1.getHour() + "\tMinute = " + time1.getMinute() + "\t Second = " + time1.getSecond());
        Time time2 = new Time(600000000);
        System.out.println("Time2:");
        System.out.println("Hour = " + time2.getHour() + "\tMinute = " + time2.getMinute() + "\t Second = " + time2.getSecond());
        Time time3 = new Time(5, 30, 55);
        System.out.println("Time3:");
        System.out.println("Hour = " + time2.getHour() + "\tMinute = " + time2.getMinute() + "\t Second = " + time2.getSecond());
    }
}
