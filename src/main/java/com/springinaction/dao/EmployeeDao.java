package com.springinaction.dao;

import com.springinaction.model.Employee;

/**
 * Created by IntelliJ IDEA
 * Author: kangxiongwei1
 * Date: 2016/1/14 17:08
 *
 * 雇员的数据接入接口
 */
public interface EmployeeDao {

    Employee getEmployeeById(int id);

}
