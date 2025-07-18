package com.cognizant.spring_countrycode.controller;

import com.cognizant.spring_countrycode.model.Country;
import com.cognizant.spring_countrycode.service.CountryService;
import com.cognizant.spring_countrycode.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
        return countryService.getCountry(code);
    }
}
