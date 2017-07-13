package com.dxfjyygy.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by longjinwen on 13/07/2017.
 */
@Controller
public class TestRequestController {
    @RequestMapping(value = "/goPage1")
    public String goPage(){
        return "page1";
    }
}
