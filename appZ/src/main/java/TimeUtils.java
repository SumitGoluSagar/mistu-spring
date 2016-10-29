import org.joda.time.DateTime;

/**
 * Created by sumit on 30/10/16.
 */
public class TimeUtils {
    public static String getCurrentDateTime(){
        DateTime dateTime = new DateTime();
        return  dateTime.toString();
    }
}
