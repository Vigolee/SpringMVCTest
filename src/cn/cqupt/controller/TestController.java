package cn.cqupt.controller;

import cn.cqupt.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Vigo on 17/5/9.
 */
@Controller
//@RequestMapping(value = "/test")
public class TestController {
    /**
     * 首页
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(){
        return "test";
    }
    /**
     * 参数传递实体类
     * @param user
     * @return
     */
    @RequestMapping(value = "/entity")
    public ModelAndView testObjectParam(User user){
        System.out.println("===test===");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "user: " + user.id + ", " + user.name);
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    /***
     * 参数传递Model
     * @param model
     * @return
     */
    @RequestMapping(value = "/model")
    public String  testModelParam(Model model){
        model.addAttribute("message","I am model test");
        return "hello";
    }
    @RequestMapping(value = "/array")
    public void testArrayParam(@RequestParam(value = "titles[]") String[] titles){
        for (int i = 0; i < titles.length; i++) {
            System.out.println(titles[i]);
        }
    }

    @RequestMapping(value = "/hello")
    public Map<String, String>  testReturnModel(Model model){
        System.out.println("====hello===");
        model.addAttribute("message","I am returnModel");
        Map<String, String> map = new HashMap<>();
        map.put("message","a");
        return map;
    }

    @RequestMapping(value = "/showUsers", method = {RequestMethod.POST})
    @ResponseBody
    public String  testArrayObject(@RequestBody List<User> users){
        System.out.println("======showUsers=====");
        return "good";
    }

    @RequestMapping("/vig")
    public void test(Vigo vigo, String a){
        System.out.println(vigo.toString());
        System.out.println(a);
        System.out.println("id");
    }
    

}
