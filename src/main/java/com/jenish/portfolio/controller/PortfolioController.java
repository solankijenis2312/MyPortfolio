package com.jenish.portfolio.controller;


import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
public class PortfolioController
{

   //return th index.html

    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("page","home");
        return "index";
    }

    //routing about.html
    //http://localhost:8080/about
    @GetMapping("/about")
    public String about(Model model)
    {

    model.addAttribute("page","about");
    model.addAttribute("name","location");
    model.addAttribute("location","Ahmedabad, Gujrat");
    model.addAttribute("age",19);
    model.addAttribute("email","sjenish247@gmail.com");
    model.addAttribute("phone","9898132312");
    model.addAttribute("github","https://github.com/solankijenis2312");

        return "model";
    }

    //Skills Page Route
     //URL: http://localhost:8080/skills

    @GetMapping("/skills")
    public String skills(Model model) {
        model.addAttribute("page", "skills");

        String[] languages = {"Java"};
        String[] frameworks = {"Spring Core", "Spring boot"};
        //String[] concepts = {"OOP", "Exception Handling", "Multithreading"};
        // String[] databases = {"MySQL", "PostgreSQL"};
        String[] tools = {"IntelliJ IDEA", "VsCode", "Postman"};

        model.addAttribute("languages", languages);
        model.addAttribute("frameworks", frameworks);
        // model.addAttribute("concepts", concepts);
        // model.addAttribute("databases", databases);
        model.addAttribute("tools", tools);

        return "skills";
    }
}