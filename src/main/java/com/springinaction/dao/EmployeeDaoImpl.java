package com.springinaction.dao;

import com.springinaction.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA
 * Author: kangxiongwei1
 * Date: 2016/1/14 17:10
 */
public class EmployeeDaoImpl implements EmployeeDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public Employee getEmployeeById(int id) {
        String sql = "select id, firstname, lastname, salary from employee where id = ?";
        return jdbcTemplate.queryForObject(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                return employee;
            }
        }, id);
    }
}
