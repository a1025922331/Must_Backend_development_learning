package mo.must.day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest1 {
    public static void main(String[] args) throws ParseException {
//        method1();
        method2();
    }

    private static void method2() throws ParseException {
//        String sStartTime = "2020年11月11日 00:00:00";
//        String sEndTime = "2020年11月11日 00:00:10";
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//        Date startTime = sdf.parse(sStartTime);
//        Date endTime = sdf.parse(sEndTime);

        //创建指定日期的时间
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sTime = "1949-10-01 09:00:00";
        Date time = sdf1.parse(sTime);

        //按指定格式输出
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf2.format(time));

    }

    private static void method1() {
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date1.getTime());
        System.out.println(System.currentTimeMillis());
        date1.setTime(0);
        System.out.println(date1);
    }
}
