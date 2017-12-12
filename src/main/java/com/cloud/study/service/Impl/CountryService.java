package com.cloud.study.service.Impl;

import com.cloud.study.dao.mapper.CountryMapper;
import com.cloud.study.dao.myBatieEntity.Country;
import com.cloud.study.dao.myBatieEntity.CountryExample;
import com.cloud.study.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private CountryMapper mapper;

    public Country getById(Integer id){

        return mapper.selectByPrimaryKey(id);
    }

    public List<Country> getByExample(CountryExample example){

        return mapper.selectByExample(example);
    }

}
