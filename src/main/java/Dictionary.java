import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Dictionary extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        Map<String, String> dic = new HashMap<>();
        dic.put("hi", "chào");
        dic.put("fish", "cá");
        dic.put("chick", "gà");
        dic.put("cat", "mèo");
        String sumitedText = request.getParameter("txtSearch");
        String reslut = dic.get(sumitedText);
        request.setAttribute("reslut", reslut);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("reslutindex.jsp");
        requestDispatcher.forward(request, response);
    }

}
