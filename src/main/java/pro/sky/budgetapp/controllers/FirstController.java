package pro.sky.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String helloWorld(){
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String aboutMe(){
        return "Алексей Корниенко *** проект BudgetApp *** " +
                "создан 23.02.2023 *** наше первое вэб-приложение";
    }


//    public String page(@RequestParam String page){
//        return "input message = " + page;
//    }
}
