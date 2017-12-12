package com.cloud.study.service;

import com.cloud.study.dao.myBatieEntity.Country;
import com.cloud.study.dao.myBatieEntity.CountryExample;


import java.util.List;

public interface ICountryService {

    public Country getById(Integer id);

    public List<Country> getByExample(CountryExample example);
}
