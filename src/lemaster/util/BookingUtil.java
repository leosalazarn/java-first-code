package lemaster.util;

public abstract class BookingUtil {

    public static final String BOOKING_PREFIX = "BK-";
    public static final String LINE = "-";

    public static String generateBookingCode(int id) {
        return BOOKING_PREFIX + id + LINE + System.currentTimeMillis() + LINE ;
    }

    public static boolean validateSeats(int requested, int available) {
        return requested > 0 && requested <= available;
    }


    public static String getBrand() {
        return null;
    }

    public abstract String takeOff();
}
