package com.s5.springbootstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration currency;

    @RequestMapping(
            method = RequestMethod.GET,value = "/currency-configuration")
    public CurrencyServiceConfiguration getCurrency(){
        return currency;
    }
}
