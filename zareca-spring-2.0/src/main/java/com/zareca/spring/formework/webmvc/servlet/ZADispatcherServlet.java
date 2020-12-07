package com.zareca.spring.formework.webmvc.servlet;

import com.zareca.spring.formework.context.ZAApplicationContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: ly
 * @Date: 2020/12/6 20:26
 * @Description:
 */
public class ZADispatcherServlet extends HttpServlet {
    private final String CONTEXT_CONFIG_LOCATION = "contextConfigLocation";
    private ZAApplicationContext context;

    @Override
    public void init(ServletConfig config) throws ServletException {
        // 初始化ApplicationContext
        context = new ZAApplicationContext(config.getInitParameter(CONTEXT_CONFIG_LOCATION));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doDispatch(req, resp);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {

    }


}
