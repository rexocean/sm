package com.wangfei.sm.service.impl;

import com.wangfei.sm.dao.SelfDao;
import com.wangfei.sm.dao.StaffDao;
import com.wangfei.sm.entity.Staff;
import com.wangfei.sm.service.SelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("selfService")
public class SelfServiceImpl implements SelfService {

    @Autowired
    private SelfDao selfDao;

    @Autowired
    private StaffDao staffDao;

    @Override
    public Staff login(String account, String password) {
        Staff staff = selfDao.selectByAccount(account);
        if (staff == null) {
            return null;
        }
        if (staff.getPassword().equals(password)) {
            return staff;
        }
        return null;
    }

    @Override
    public void changePassword(Integer id, String password) {
        Staff staff = staffDao.selectById(id);
        staff.setPassword(password);
        staffDao.update(staff);
    }
}
