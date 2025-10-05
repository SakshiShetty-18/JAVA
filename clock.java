import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class WorldClock {
    public static void main(String[] args) {
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        printTime("San Francisco", ZoneOffset.ofHours(-7), formatter);
        printTime("New York", ZoneOffset.ofHours(-4), formatter);
        printTime("UTC", ZoneOffset.UTC, formatter);
        printTime("London", ZoneOffset.ofHours(1), formatter);
        printTime("Dubai", ZoneOffset.ofHours(4), formatter);
        printTime("Bangalore", ZoneOffset.ofHoursMinutes(5, 30), formatter);
        printTime("Singapore", ZoneOffset.ofHours(8), formatter);
        printTime("Tokyo", ZoneOffset.ofHours(9), formatter);
        printTime("Sydney", ZoneOffset.ofHours(10), formatter);
        printTime("Wellington", ZoneOffset.ofHours(12), formatter);
    }
private static void printTime(String city, ZoneOffset offset, DateTimeFormatter formatter) {
        ZonedDateTime cityTime = ZonedDateTime.now(offset);
        System.out.println(city + ": " + cityTime.format(formatter));
    }
}