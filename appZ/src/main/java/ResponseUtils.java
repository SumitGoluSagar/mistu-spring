import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sumit on 30/10/16.
 */
public class ResponseUtils {
    public static void setResponseHeader(HttpServletResponse response){
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
    }

    public static void setResponseText(HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            out.print(TimeUtils.getCurrentDateTime());
        }catch (IOException ex){
            // log the error
        }finally {
            if (out != null) {
                out.flush();
                out.close();
            }
        }

    }
}
