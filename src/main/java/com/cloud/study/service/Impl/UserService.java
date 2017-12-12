package com.cloud.study.service.Impl;

import com.cloud.study.dao.mapper.UserMapper;
import com.cloud.study.dao.myBatieEntity.User;
import com.cloud.study.dao.myBatieEntity.UserExample;
import com.cloud.study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public User getById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getByExample(UserExample example) {
        return mapper.selectByExample(example);
    }
}
