package cc.isotopestudio.scalepicker;
/*
 * Created by Mars Tan on 2/26/2017.
 * Copyright ISOTOPE Studio
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GenAction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html");

        // 实际的逻辑是在这里
        PrintWriter out = response.getWriter();
        out.println("<h1>" + ScaleType.SCALE1.getName() + "</h1>");
        for (int i = 0; i < 5; i++) {
            out.println("<p>" + ScaleResult.genRandom(ScaleType.SCALE1) + "</p>");
        }

        out.println("<br />");
        out.println("<h1>" + ScaleType.SCALE3.getName() + "</h1>");
        for (int i = 0; i < 5; i++) {
            out.println("<p>" + ScaleResult.genRandom(ScaleType.SCALE3) + "</p>");
        }

        out.println("<br />");
        out.println("<h1>" + ScaleType.SCALE6.getName() + "</h1>");
        for (int i = 0; i < 5; i++) {
            out.println("<p>" + ScaleResult.genRandom(ScaleType.SCALE6) + "</p>");
        }

        out.println("<br />");
        out.println("<h1>" + ScaleType.SCALEIN3.getName() + "</h1>");
        for (int i = 0; i < 5; i++) {
            out.println("<p>" + ScaleResult.genRandom(ScaleType.SCALEIN3) + "</p>");
        }

        out.println("<br />");
        out.println("<h1>" + ScaleType.CHROMATICSCALESAPART.getName() + "</h1>");
        for (int i = 0; i < 5; i++) {
            out.println("<p>" + ScaleResult.genRandom(ScaleType.CHROMATICSCALESAPART) + "</p>");
        }

        out.println("<br />");
        out.println("<h1>" + ScaleType.CHROMATICSCALES.getName() + "</h1>");
        for (int i = 0; i < 5; i++) {
            out.println("<p>" + ScaleResult.genRandom(ScaleType.CHROMATICSCALES) + "</p>");
        }

        out.println("<br />");
        out.println("<h1>" + ScaleType.WHOLETONE.getName() + "</h1>");
            out.println("<p>" + ScaleResult.genRandom(ScaleType.WHOLETONE) + "</p>");

        out.println("<br />");
        out.println("<h1>" + ScaleType.ARPEGGIOS.getName() + "</h1>");
        for (int i = 0; i < 5; i++) {
            out.println("<p>" + ScaleResult.genRandom(ScaleType.ARPEGGIOS) + "</p>");
        }

        out.println("<br />");
        out.println("<h1>" + ScaleType.DOMINANT.getName() + "</h1>");
        for (int i = 0; i < 5; i++) {
            out.println("<p>" + ScaleResult.genRandom(ScaleType.DOMINANT) + "</p>");
        }

        out.println("<br />");
        out.println("<h1>" + ScaleType.DIMINISHED.getName() + "</h1>");
        for (int i = 0; i < 5; i++) {
            out.println("<p>" + ScaleResult.genRandom(ScaleType.DIMINISHED) + "</p>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    }
}
