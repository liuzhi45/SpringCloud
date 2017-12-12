package com.cloud.study.service;

import com.cloud.study.dao.myBatieEntity.User;
import com.cloud.study.dao.myBatieEntity.UserExample;

import java.util.List;

public interface IUserService {


    public User getById(Integer id);

    public List<User> getByExample(UserExample example);
}
