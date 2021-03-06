package com.dxfjyygy.action;

import com.dxfjyygy.mdl.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by longjinwen on 12/07/2017.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public String index(){
        return "../index";
    }
    @RequestMapping(value = "/login")
    public String login(@ModelAttribute("form") User user, Model model, HttpSession session){
        model.addAttribute("user",user);
        session.setAttribute("user",user);
       if("admin".equals(user.getName()) && "lllongjin".equals(user.getPwd())){
           return  "admin/detail";
       }else{
           return "error";
       }
    }
}
