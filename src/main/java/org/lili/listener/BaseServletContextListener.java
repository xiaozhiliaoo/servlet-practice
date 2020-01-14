package org.lili.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author lili
 * @date 2020/1/12 23:25
 * @description
 */
public class BaseServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String contextPath = sce.getServletContext().getContextPath();
        System.out.println("BaseServletContextListener.contextInitialized init, contextPath is:"+contextPath);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("BaseServletContextListener.contextInitialized destory");
    }
}
