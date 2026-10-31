import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date: " + now.toLocalDate());
        System.out.println("Current Time: " + now.toLocalTime());
    }
}