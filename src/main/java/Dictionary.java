import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


public class Dictionary extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        Map<String, String> dic = new HashMap<>();
        dic.put("hi", "chào");
        dic.put("fish", "cá");
        dic.put("chick", "gà");
        String sumitedText = request.getParameter("txtSearch");
        String reslut = dic.get(sumitedText);

        if (reslut != null) {
            writer.print("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>reslut</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h1 align=\"center\">" + reslut + "</h1>\n" +
                    "<button type=\"button\" onclick =\" window.location.href = 'http://localhost:8080';\">return</button>\n" +
                    "</body>\n" +
                    "</html>");
        } else {
            writer.print("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>reslut</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h1 align=\"center\">Chưa có dữ liệu</h1>\n" +
                    "<button type=\"button\" onclick =\" window.location.href = 'http://localhost:8080';\">return</button>\n" +
                    "</body>\n" +
                    "</html>");
        }

    }

}
