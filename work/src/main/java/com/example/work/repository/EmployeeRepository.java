package com.example.work.repository;

import com.example.work.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author YuMing
 * @Date 2020/7/9 4:31 下午
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
