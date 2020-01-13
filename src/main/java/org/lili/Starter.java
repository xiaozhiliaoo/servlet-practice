package org.lili;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.net.URL;

/**
 * @author lili
 * @date 2020/1/13 10:26
 * @description
 */
public class Starter {
    //https://www.jianshu.com/p/48146aecde00
    public static void main(String[] args) throws LifecycleException {
         int port = 8080;
        String contextPath = "/helloweb";
        Tomcat tomcat = new Tomcat();
        URL url = Starter.class.getClassLoader().getResource("web.xml");
        String pwd = StringUtils.substringBefore(url.getPath(), "/target/classes");
        tomcat.setBaseDir(pwd);
        tomcat.setPort(port);
        StringBuilder webAppBuilder = new StringBuilder();
        webAppBuilder.append(pwd).append(File.separator).append("web");
        String webapp = webAppBuilder.toString();

        tomcat.addWebapp(contextPath, webapp);
        tomcat.enableNaming();
        tomcat.start();
        tomcat.getServer().await();
    }
}
