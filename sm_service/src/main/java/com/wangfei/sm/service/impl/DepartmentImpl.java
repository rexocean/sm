package com.wangfei.sm.service.impl;

import com.wangfei.sm.dao.DepartmentDao;
import com.wangfei.sm.entity.Department;
import com.wangfei.sm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentService")
public class DepartmentImpl implements DepartmentService {
    //用注解方式注入，可以不设置其settergetter访问器
    @Autowired
    private DepartmentDao departmentDao;


    @Override
    public void add(Department department) {
        departmentDao.insert(department);
    }

    @Override
    public void remove(Integer id) {
        departmentDao.delete(id);

    }

    @Override
    public void edit(Department department) {
        departmentDao.update(department);
    }

    @Override
    public Department get(Integer id) {
        return departmentDao.selectById(id);

    }

    @Override
    public List<Department> getAll() {
        return departmentDao.selectAll();
    }
}
