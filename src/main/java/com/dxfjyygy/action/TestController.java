package com.dxfjyygy.action;

import com.dxfjyygy.mdl.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by longjinwen on 11/07/2017.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public  String index(){
        return "test";
    }
    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String create(){
        return "admin/create";
    }
    @RequestMapping(value = "/save")
    public String Save(@ModelAttribute("form") User user ,Model model){
        model.addAttribute("user",user);
//        Map modelMap  = model.asMap();
//        System.out.println("Model data.....");
//        for(Object o :modelMap.keySet()){
//            Object modelValue =  modelMap.get(o);
//            System.out.println(o+"------"+modelValue);
     //   }
        return  "admin/detail";
    }
}
