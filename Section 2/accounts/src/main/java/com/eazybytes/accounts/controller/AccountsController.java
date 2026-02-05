package com.eazybytes.accounts.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    public String sayHello(){
        return "Hello World";
    }
}
