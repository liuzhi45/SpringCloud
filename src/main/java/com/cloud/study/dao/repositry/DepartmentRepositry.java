package com.cloud.study.dao.repositry;

import com.cloud.study.dao.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepositry extends JpaRepository<Department, Integer> {

}
