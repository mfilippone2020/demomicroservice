package com.example.web.demomicroservice;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;


@Service
public class DemoEmployeeService {


    public static final String EMPLOYEE_SERVICE_URL ="http://localhost:8080";


    public Flux<Map> getEmployees() {
        return WebClient.builder().build().get().uri(EMPLOYEE_SERVICE_URL + "/getEmployees/Employees").retrieve()
                .bodyToFlux(Map.class);
    }
}
