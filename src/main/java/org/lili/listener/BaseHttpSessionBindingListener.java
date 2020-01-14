package org.lili.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @author lili
 * @date 2020/1/13 23:02
 * @description
 */
@WebListener
public class BaseHttpSessionBindingListener implements HttpSessionBindingListener {
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("BaseHttpSessionBindingListener valueBound:event name:" + event.getName() + ",event value:" + event.getValue());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("BaseHttpSessionBindingListener valueUnbound:event name:" + event.getName() + ",event value:" + event.getValue());
    }
}
