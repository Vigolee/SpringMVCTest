package cn.cqupt.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *Spring2.5之前，我们都是通过实现Controller接口或其实现来定义我们的处理器类
 * Created by lwg on 15/6/18.
 */
public class HelloWordController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //1、收集参数、验证参数
        //2、绑定参数到命令对象
        //3、将命令对象传入业务对象进行业务处理
        //4、选择下一个页面
        ModelAndView modelAndView = new ModelAndView();
        //添加模型数据 可以是任意的POJO对象
        modelAndView.addObject("message","Hello world");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
