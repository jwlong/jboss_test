package com.dxfjyygy.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by longjinwen on 13/07/2017.
 */
public class UserLoginFilter implements javax.servlet.Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(" user filter init() ");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest) request).getSession();
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp  = (HttpServletResponse) response;
        if(session.getAttribute("user") == null){
            if(session.isNew()){
                System.out.println("这个session 是新的");
            }
            System.out.println("path:================>"+req.getContextPath());
            resp.sendRedirect(req.getContextPath()+"/index.jsp");
        }else {
            chain.doFilter(request,response);
        }

    }

    public void destroy() {
        System.out.println(" user filter destroy() ");
    }
}
