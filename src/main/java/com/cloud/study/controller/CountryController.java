package com.cloud.study.controller;

import com.cloud.study.dao.myBatieEntity.Country;
import com.cloud.study.dao.myBatieEntity.CountryExample;
import com.cloud.study.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("country")
public class CountryController {

    @Autowired
    private ICountryService service;

    @PostMapping(value="/getById",produces ="application/json" )
    public Object getCountry(@RequestParam("id") Integer id){
        return service.getById(id);
    }

    @PostMapping(value = "/getByObj",produces ="application/json")
    public Object getCountry(@RequestParam("Country") Country country){
        CountryExample example = new CountryExample();

        if(country.getCountrycode()!=null){
            example.createCriteria().andCountrycodeEqualTo(country.getCountrycode());
        }

        if (country.getCountryname()!=null){
            example.createCriteria().andCountrynameEqualTo(country.getCountryname());
        }
        return service.getByExample(example);
    }
}
