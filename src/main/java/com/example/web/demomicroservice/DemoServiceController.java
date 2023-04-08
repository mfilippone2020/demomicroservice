package com.example.web.demomicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.logging.Logger;

@Controller
public class DemoServiceController {

    @Autowired
    protected DemoEmployeeService demoEmployeeService;


    protected Logger logger = Logger.getLogger(DemoServiceController.class
            .getName());


    public DemoServiceController(DemoEmployeeService demoEmployeeService) {
        this.demoEmployeeService = demoEmployeeService;
    }

    @RequestMapping("/getEmployees")
    public String doEmployees(Model model) {

        Flux<Map> employees = demoEmployeeService.getEmployees();

        logger.info("employees : " + employees.collectList().block());
        model.addAttribute("employee", employees.collectList().block().get(1));

        return "results";
    }

}
