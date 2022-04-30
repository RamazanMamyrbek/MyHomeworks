package objects;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time(){
    long theTime = System.currentTimeMillis();
    setTime(theTime);
    }

    public Time(long hour, long minute, long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(long ellapsedTime){
        setTime(ellapsedTime);
    }

    public void setTime(long ellapsedTime) {
    hour = ellapsedTime/1000/60/60%24;
    minute = ellapsedTime/1000/60%60;
    second = ellapsedTime/1000%60;
    }
    public long getHour(){return hour;}
    public long getMinute(){return minute;}
    public long getSecond(){return second;}




}
