package com.dxfjyygy.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by longjinwen on 11/07/2017.
 */
public class CharsetFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
