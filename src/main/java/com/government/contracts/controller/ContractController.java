package com.government.contracts.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {

    @RequestMapping("/info")
    public String info() {
        return "info";
    }

}
