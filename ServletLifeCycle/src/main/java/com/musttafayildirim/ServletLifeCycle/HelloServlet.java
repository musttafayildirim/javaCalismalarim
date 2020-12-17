package com.musttafayildirim.ServletLifeCycle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.servlet.ServletException;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
        System.out.println("init() metodu servlet boyunca bir defa çalışır...");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        PrintWriter out = response.getWriter();
        Date today = new Date();
        String message1 = "ServletLifeCycle";

        out.println("<html><body> <h1> " + message1 + "</h1>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1> Today => " + today + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
        System.out.println("Proje destroy oldu......");
    }
}