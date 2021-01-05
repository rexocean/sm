package com.wangfei.sm.service;

import com.wangfei.sm.entity.Department;

import java.util.List;

//业务层接口
public interface DepartmentService {
    void add(Department department);

    void remove(Integer id);

    void edit(Department department);

    Department get(Integer id);

    List<Department> getAll();
}
