package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LabController {

    @GetMapping("/lab")
    public String labList(Model model){

        model.addAttribute("firstLab","lab_01_coupling");
        model.addAttribute("secondLab","lab_02_IoC");
        model.addAttribute("thirdLab","lab_03_DI");
        model.addAttribute("fourthLab","lab_04_springboot");
        model.addAttribute("fifthLab","lab_01_MVC");
        return "lab/lab-list";
    }

}
