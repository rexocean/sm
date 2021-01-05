package com.wangfei.sm.service;


import com.wangfei.sm.entity.Staff;

public interface SelfService {
    Staff login(String account, String password);

    void changePassword(Integer id, String password);


}
