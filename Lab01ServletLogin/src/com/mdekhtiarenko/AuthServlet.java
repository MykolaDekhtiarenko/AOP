package com.mdekhtiarenko;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by mykola.dekhtiarenko on 18.01.17.
 */

public class AuthServlet extends HttpServlet{


    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            out.println("<html>");

            out.println("<head>");
            out.println("<title>Авторизація</title>");
            out.println("</head>");

            out.println("<body>");

            out.println("<form method='post' action='AuthServlet'>");
            out.println("User name:<br>");
            out.println("<input type='text' name='username'  >");
            out.println("<br>");
            out.println("Password:<br>");
            out.println("<input type='password' name='password'>");
            out.println("<br>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");

            out.println("</body>");

            out.println("</html>");
        } finally {
            out.close();
        }
    }


    protected void processResponce(HttpServletRequest request, HttpServletResponse response, String result) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            out.println("<html>");

            out.println("<head>");
            out.println("<title>Авторизація</title>");
            out.println("</head>");

            out.println("<body>");

            out.println("<h1>"+result+"</h1>");

            out.println("</body>");

            out.println("</html>");
        } finally {
            out.close();
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("username").equals("admin")&&request.getParameter("password").equals("admin")){
            processResponce(request, response, "Успішно авторизовано!");
        }
        else{
            processResponce(request, response, "Фейл!");
        }
    }


}


