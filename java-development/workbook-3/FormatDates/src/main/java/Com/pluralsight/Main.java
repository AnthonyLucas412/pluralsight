package Com.pluralsight;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
String FormattedDate = today.format(dateTimeFormatter);
        System.out.println("Today is: " + FormattedDate);

        DateTimeFormatter otherdate = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        String anotherformatteddate = today.format(otherdate);
        System.out.println("Today is: " + anotherformatteddate);

        DateTimeFormatter anotherdate = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String onceanotherformatteddate = today.format(anotherdate);
        System.out.println("Today is: " + onceanotherformatteddate);


        Date date = new Date();
        SimpleDateFormat requiredFormat = new SimpleDateFormat("EEEE, MMM d, yyyy HH:mm  'in GMT' ");
        requiredFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String gmtTime = requiredFormat.format(date);
        System.out.println(gmtTime);

        

        DateTimeFormatter potato = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm  ");
        String potatodate = today.format(potato);
        System.out.println("Today is: " + potatodate);







    }
}
