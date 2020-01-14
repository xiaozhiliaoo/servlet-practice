package org.lili.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author lili
 * @date 2020/1/13 22:52
 * @description
 */
@WebListener
public class BaseHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("BaseHttpSessionListener sessionCreated sessionId:"+se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("BaseHttpSessionListener sessionDestroyed sessionId:"+se.getSession().getId());

    }
}
