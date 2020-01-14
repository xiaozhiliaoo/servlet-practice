package org.lili.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lili
 * @date 2020/1/12 23:12
 * @description
 */
public class SimpleFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("SimpleFilter init param: "+ filterConfig.getInitParameter("filter"));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("before do SimpleFilter");
        chain.doFilter(request,response);
        System.out.println("after do SimpleFilter");
    }

    @Override
    public void destroy() {
        System.out.println("SimpleFilter destroy");
    }
}
