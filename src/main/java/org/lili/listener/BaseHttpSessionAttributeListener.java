package org.lili.listener;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author lili
 * @date 2020/1/13 22:54
 * @description
 */
@WebListener
public class BaseHttpSessionAttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("BaseHttpSessionAttributeListener attributeAdded:event name:" + event.getName() + ",event value:" + event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("BaseHttpSessionAttributeListener attributeRemoved:event name:" + event.getName() + ",event value:" + event.getValue());

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("BaseHttpSessionAttributeListener attributeReplaced:event name:" + event.getName() + ",event value:" + event.getValue());
    }
}
