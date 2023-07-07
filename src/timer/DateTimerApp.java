package timer;

import java.lang.ref.Cleaner;
import java.util.Calendar;
import java.util.Date;

public class DateTimerApp {
    
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DATE, 7);
        calendar.set(Calendar.HOUR_OF_DAY, 13);
        calendar.set(Calendar.MINUTE, 50);
        calendar.set(Calendar.SECOND, 0);

        Date scheculeTime = calendar.getTime();
        System.out.println(scheculeTime);
    }

}
