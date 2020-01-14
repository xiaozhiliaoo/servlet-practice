package org.lili.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * @author lili
 * @date 2020/1/12 23:34
 * @description
 */
@WebListener
public class BaseServletContextAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("BaseServletContextAttributeListener attributeAdded:event name:" + event.getName() + ",event value:" + event.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("BaseServletContextAttributeListener attributeRemoved:event name:" + event.getName() + ",event value:" + event.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("BaseServletContextAttributeListener attributeReplaced:event name:" + event.getName() + ",event value:" + event.getValue());
    }
}
