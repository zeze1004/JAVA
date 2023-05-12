package chap07_OOP2.modifier;

public class TimeTest {
    public static void main(String[] args)
    {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
//          t.hour = 13;            // hour의 접근제어자가 private이어서 자손 클래스에서 접근 x, 접근할려면 protected
        t.setHour(t.getHour()+1);   // set변수(): 멤버변수의 값을 변경하는 메서드, get변수(): 멤버변수의 값을 반환하는 메서드
        System.out.println(t);      // System.out.println(t.toString());과 같음
    }
}

class Time {
    private int hour;             // protected int hour; 시 자손클래스에서 변수 접근 가능
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() { return hour; }
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }
    public int getMinute() { return minute; }
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    public int getSecond() { return second; }
    public void setSecond(int second) {
        if (second < 0 || second > 59) return;
        this.second = second;
    }
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}