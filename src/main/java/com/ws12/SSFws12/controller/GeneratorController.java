package com.ws12.SSFws12.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ws12.SSFws12.model.numbersList;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class GeneratorController {
    //getMapping is a shortcut for RequestMapping method = GET
    @GetMapping("")
    public String returnGenerator() {
        return "generator";
    }
    @GetMapping("/userSubmit")
    public String getMethodName(@RequestParam("howMany") int howMany ,Model model) {
        if (howMany>10 || howMany<1){
            return "niceTry";
        }
        List<Integer> numberList = numbersList.getGeneratedList(howMany,30);
        model.addAttribute("numberList", numberList);
        return "userSubmit";
    }
    
}
