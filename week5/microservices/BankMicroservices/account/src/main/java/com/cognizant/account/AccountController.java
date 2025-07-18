package com.cognizant.account;

import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public String getAccountDetails(@PathVariable String number) {
        return "Account Details for account number: " + number;
    }
}
