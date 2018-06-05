package cn.cqupt.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lwg on 15/6/18.
 */
//将一个POJO类声明为处理器
@Controller
public class HelloWordController2 {
    //请求URL到处理器功能处理方法的映射
    @RequestMapping(value="/hello2")

    public ModelAndView helloWord(){
        //1、收集参数
        //2、绑定参数到命令对象
        //3、调用业务对象
        //4、选择下一个页面
        ModelAndView mv = new ModelAndView();
        //添加模型数据 可以是任意的POJO对象
        mv.addObject("message", "Hello World!");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("hello2");
        return mv;
    }

    @RequestMapping(value="/hello3" ,produces="application/text")
    public String getData(String s){
        System.out.println(s);
        return "hello3";
    }

    @RequestMapping(value="/hello4")
    @ResponseBody
    public String get(int i){
        i = i + 8;
        String.valueOf(i);
        return String.valueOf(i);
    }
    @RequestMapping(value="/hello5")
    @ResponseBody
    public String get(String s){
        s += "nihao";
        return s;
    }
}
