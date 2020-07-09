package com.example.work.controller;

import com.example.work.entity.Employee;
import com.example.work.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YuMing
 * @Date 2020/7/9 4:32 下午
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @ResponseBody
    @RequestMapping("/insert")
    public Employee create(@RequestParam("name") String name, @RequestParam("password") String password) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setPassword(password);
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }

    @ResponseBody
    @RequestMapping("/find")
    public String findById(@RequestParam("id") Long id) {
        Employee employee = employeeRepository.getOne(id);
        return employee.toString();
    }
}
