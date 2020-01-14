package org.lili.servlet;

import org.lili.listener.MyAsycListener;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lili
 * @date 2020/1/14 10:25
 * @description
 */
@WebServlet(name = "AsyncListenerServlet", urlPatterns = {"/asyncListener"}, asyncSupported = true)
public class AsyncListenerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final AsyncContext asyncContext = req.getAsyncContext();
        asyncContext.setTimeout(5000);
        asyncContext.addListener(new MyAsycListener());
        asyncContext.start(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String greeting = "hi from listener";
                req.setAttribute("greeting",greeting);
                asyncContext.dispatch("/test.jsp");
            }
        });
    }
}
