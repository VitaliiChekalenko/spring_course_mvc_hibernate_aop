package com.vitaliichekalenko.spring.mvc_hibernate_aop.service;

import com.vitaliichekalenko.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.vitaliichekalenko.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
