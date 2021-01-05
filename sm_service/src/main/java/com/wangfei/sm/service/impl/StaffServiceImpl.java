package com.wangfei.sm.service.impl;

import com.wangfei.sm.dao.StaffDao;
import com.wangfei.sm.entity.Staff;
import com.wangfei.sm.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("staffService")
public class StaffServiceImpl implements StaffService {


    @Autowired
    private StaffDao staffDao;

    @Override
    public void add(Staff staff) {
        staff.setPassword("123456");
        staff.setWorkTime(new Date());
        staff.setStatus("正常");
        staffDao.insert(staff);
    }

    @Override
    public void remove(Integer id) {
        staffDao.delete(id);
    }

    @Override
    public void edit(Staff staff) {
        staffDao.update(staff);
    }

    @Override
    public Staff get(Integer id) {
        return staffDao.selectById(id);
    }

    @Override
    public List<Staff> getAll() {
        return staffDao.selectAll();
    }
}
