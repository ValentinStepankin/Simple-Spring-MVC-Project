package com.valentinstepankin.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class MyController {

    @RequestMapping("/askDetails")
    public String askDetails(Model model){

        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }
    }

}
