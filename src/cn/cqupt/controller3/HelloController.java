package cn.cqupt.controller3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Vigo on 17/5/8.
 */
@org.springframework.stereotype.Controller
public class HelloController{

    @RequestMapping(value = "/hand")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("===========HelloController");
        ModelAndView model = new ModelAndView("hello");
        model.addObject("message", "Hello World!");
        return model;
    }
}
