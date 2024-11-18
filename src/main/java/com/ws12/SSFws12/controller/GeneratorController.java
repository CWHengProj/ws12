package com.ws12.SSFws12.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ws12.SSFws12.model.numbersList;



@Controller
public class GeneratorController {
    //getMapping is a shortcut for RequestMapping method = GET
    @GetMapping("")
    public String returnGenerator(Model model) {
        List<Integer> numberList = numbersList.getGeneratedList(5,30);
        model.addAttribute("numberList", numberList);
        return "generator";
    }
}
