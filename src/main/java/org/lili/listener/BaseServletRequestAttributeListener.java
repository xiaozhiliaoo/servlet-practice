package org.lili.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * @author lili
 * @date 2020/1/13 23:06
 * @description
 */
@WebListener
public class BaseServletRequestAttributeListener implements ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletRequestAttributeEvent event) {
        System.out.println("BaseServletRequestAttributeListener attributeAdded:event name:" + event.getName() + ",event value:" + event.getValue());

    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent event) {
        System.out.println("BaseServletRequestAttributeListener attributeRemoved:event name:" + event.getName() + ",event value:" + event.getValue());

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent event) {
        System.out.println("BaseServletRequestAttributeListener attributeReplaced:event name:" + event.getName() + ",event value:" + event.getValue());
    }
}
