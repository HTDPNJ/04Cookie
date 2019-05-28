package com.hfut.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* Cookie学习
* 作用：
* 解决了不同请求的数据共享问题*/
public class CookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //获取请求信息
        //处理请求信息
        //响应处理结果
        //使用Cookie进行浏览器端的数据存储
        //创建Cookie对象
        Cookie c=new Cookie("mouse","thinkpad");
        Cookie c2=new Cookie("key","hfut");
        c2.setMaxAge(3*24*3600);
        c2.setPath("/manager/gc"); //存储路径设置
        //响应Cookie
        resp.addCookie(c);
        resp.addCookie(c2);
        //直接响应
        resp.getWriter().write("Cookie学习");
        //请求转发
        //重定向
    }
}
