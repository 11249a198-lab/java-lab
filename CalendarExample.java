import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Using Calendar:");
        System.out.println("Date: " + cal.get(Calendar.DATE));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        GregorianCalendar gcal = new GregorianCalendar();
        System.out.println("\nUsing GregorianCalendar:");
        System.out.println("Date: " + gcal.get(Calendar.DATE));
        System.out.println("Month: " + (gcal.get(Calendar.MONTH) + 1));
        System.out.println("Year: " + gcal.get(Calendar.YEAR));
    }
}