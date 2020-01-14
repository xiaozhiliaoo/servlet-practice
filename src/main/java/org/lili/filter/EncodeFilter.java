package org.lili.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lili
 * @date 2020/1/12 23:17
 * @description
 */
public class EncodeFilter implements Filter {
    private String charSet;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.charSet = filterConfig.getInitParameter("charSet");

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("before do EncodeFilter");
        request.setCharacterEncoding(charSet);
        chain.doFilter(request,response);
        System.out.println("after do EncodeFilter");
    }
}
