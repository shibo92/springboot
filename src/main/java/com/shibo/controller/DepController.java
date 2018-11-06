package com.shibo.controller;

import com.shibo.entity.Department;
import com.shibo.entity.Employee;
import com.shibo.mapper.DepartmentMapper;
import com.shibo.mapper.EmpolyeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepController {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private EmpolyeeMapper empolyeeMapper;

    @GetMapping("/department/{id}")
    public Department getDepartment(@PathVariable("id") Integer departmentId){
        return departmentMapper.getDepartment(departmentId);
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") Integer employeeId){
        return empolyeeMapper.getEmployee(employeeId);
    }
}
