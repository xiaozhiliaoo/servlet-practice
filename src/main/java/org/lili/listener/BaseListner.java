package org.lili.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author lili
 * @date 2020/1/13 12:13
 * @description
 */
@WebListener
public class BaseListner implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context-key:" + sce.getServletContext().getInitParameter("context-key"));
        System.out.println("WebListener contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("WebListener contextDestroyed");
    }
}
