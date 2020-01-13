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

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {
    }
}
