package mo.must.day8;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {


    public static void main(String[] args) {
//        method();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.parse("1998-04-02 10:00:00",pattern);

        LocalDateTime now = LocalDateTime.now();

        Period period = Period.between(time.toLocalDate(),now.toLocalDate());
        Duration duration = Duration.between(time,now);

        System.out.println(duration);
        System.out.println(period);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }

    private static void method() {
        LocalDateTime time1 = LocalDateTime.of(2020,11,11,00,00);
        LocalDateTime time2 = LocalDateTime.now();

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time1.toLocalDate());
        System.out.println(time1.toLocalTime());
        time1 = time1.plusDays(1);
        System.out.println(time1);
    }

}
