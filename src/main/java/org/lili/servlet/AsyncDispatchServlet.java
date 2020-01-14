package org.lili.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lili
 * @date 2020/1/13 23:19
 * @description
 */
@WebServlet(name = "AsyncDispatchServlet", urlPatterns = "/asyncDispatch", asyncSupported = true)
public class AsyncDispatchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean asyncStarted = req.isAsyncStarted();
        if (asyncStarted) {
            AsyncContext asyncContext = req.getAsyncContext();
            req.setAttribute("mainThread", Thread.currentThread().getName());
            asyncContext.setTimeout(5000);
            asyncContext.start(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    req.setAttribute("workerThread", Thread.currentThread().getName());
                    asyncContext.dispatch("/threadNames.jsp");
                }
            });
        }

    }
}
