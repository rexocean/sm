package com.wangfei.sm.dao;



import com.wangfei.sm.entity.Staff;
import org.springframework.stereotype.Repository;

@Repository("selfDao")
public interface SelfDao {

    Staff selectByAccount(String account);
}
