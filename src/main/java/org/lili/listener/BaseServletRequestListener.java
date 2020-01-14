package org.lili.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author lili
 * @date 2020/1/13 23:04
 * @description
 */
@WebListener
public class BaseServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        ServletRequest servletRequest = sre.getServletRequest();
        System.out.println("BaseServletRequestListener requestDestroyed:"+ servletRequest.getRemoteAddr()+ servletRequest.getServletContext().getContextPath());
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        ServletRequest servletRequest = sre.getServletRequest();
        System.out.println("BaseServletRequestListener requestInitialized"+ servletRequest.getRemoteAddr()+ servletRequest.getServletContext().getContextPath());

    }
}
