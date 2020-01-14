package org.lili.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lili
 * @date 2020/1/13 22:58
 * @description
 */
@WebServlet(name = "MyListener", urlPatterns = "/listener")
public class MyListenerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().setAttribute("lili-servletContext","lili-servletContext");
        req.getServletContext().setAttribute("lili-servletContext","lili-servletContextReplace");
        req.getServletContext().removeAttribute("lili-servletContext");
        req.getSession().setAttribute("lili-session","lili-session");
        req.getSession().setAttribute("lili-session","lili-sessionReplace");
        req.getSession().removeAttribute("lili-session");
        req.setAttribute("lili-request","lili-request");
        req.setAttribute("lili-request","lili-requestReplace");
        req.removeAttribute("lili-request");
    }
}
