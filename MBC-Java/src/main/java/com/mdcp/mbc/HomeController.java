package com.mdcp.mbc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
 
    @RequestMapping("/")
    public String visitHome() {
 
        // do something before returning view name
 
        return "home";
    }
    
    
    @RequestMapping("/Specialty")
    public String visitSpecialty() {
 
        // do something before returning view name
 
        return "UI/Specialty";
    }
    
    
}