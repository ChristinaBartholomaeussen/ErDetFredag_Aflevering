package com.example.controllers;

import com.example.Sevices.ErDetFredag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {


    @GetMapping("/fredag")
    @ResponseBody
    public String fredag()
{
    ErDetFredag erDetFredag = new ErDetFredag();
    erDetFredag.retunerSvar();

    if(erDetFredag.retunerSvar() == 5)
    {
        return "Yes";
    }
    else{
        return "No";
    }
}

}
