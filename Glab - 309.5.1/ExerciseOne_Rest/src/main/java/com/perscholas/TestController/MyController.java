package com.perscholas.TestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class MyController {
    @RequestMapping({"/login"})   // either type '/' or index
    public String showlogin()
    {
        return "inboxpage";
    }
    @RequestMapping("/")
    public String simplemethod() {
        return "inboxpage";
    }      //mapped to hostname:port/home/

    @RequestMapping("/index")
    public String showindex() {
        //mapped to hostname:port/home/index/
        return "inboxpage";
    }
}
