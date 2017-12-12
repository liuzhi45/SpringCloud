package com.cloud.study.dao.repositry;

import com.cloud.study.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositry extends JpaRepository<User, Integer> {

}
