package com.dxfjyygy.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by longjinwen on 11/07/2017.
 */
@Controller
public class HelloController {
    @ModelAttribute
    public void popModel (@RequestParam String a,Model model){
            model.addAttribute("attrName",a);
    }
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
