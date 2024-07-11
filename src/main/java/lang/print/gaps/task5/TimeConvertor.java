package lang.print.gaps.task5;

public class TimeConvertor {

    public void convert(float minutes) {
        float seconds = (minutes * 60);
        System.out.println(seconds);
    }

    public static void main(String[] args) {
        TimeConvertor converter = new TimeConvertor();
        converter.convert(90);
    }


}