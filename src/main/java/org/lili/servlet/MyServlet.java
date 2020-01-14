package org.lili.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author lili
 * @date 2020/1/13 22:39
 * @description
 */
@WebServlet(name = "MyServlet", urlPatterns = "/my", initParams = {
        @WebInitParam(name = "my", value = "lili"),
        @WebInitParam(name = "your", value = "yourlili"),
})
public class MyServlet implements Servlet {

    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String servletName = servletConfig.getServletName();
        String my = servletConfig.getInitParameter("my");
        String your = servletConfig.getInitParameter("your");
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("<html><head><body>Hello From " + servletName + my + your + "</body></head></html>");
    }

    @Override
    public String getServletInfo() {
        return "My Servlet";
    }

    @Override
    public void destroy() {

    }
}
