package org.lili.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebListener;
import java.io.IOException;

/**
 * @author lili
 * @date 2020/1/13 12:18
 * @description
 */
@WebFilter(filterName = "securityFilter", urlPatterns = {"/*"}, initParams = {
        @WebInitParam(name = "frequency", value = "1090"),
        @WebInitParam(name = "resolution", value = "1024"),
})
public class SecurityFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String frequency = filterConfig.getInitParameter("frequency");
        String resolution = filterConfig.getInitParameter("resolution");
        System.out.println("SecurityFilter init parmas: frequency" + frequency + ",resolution" + resolution);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("before do SecurityFilter");
        chain.doFilter(request, response);
        System.out.println("after do SecurityFilter");
    }

    @Override
    public void destroy() {
        System.out.println("SecurityFilter destroy");
    }
}
