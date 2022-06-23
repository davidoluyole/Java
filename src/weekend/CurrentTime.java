package weekend;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentTime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        String displayTime = sdf.format(cal.getTime());
        String time = sdf.format(cal.getTime());
        System.out.println(time);
    }
}
