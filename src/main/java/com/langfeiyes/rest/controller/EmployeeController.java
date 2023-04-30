package com.langfeiyes.rest.controller;

import com.langfeiyes.rest.domain.Employee;
import com.langfeiyes.rest.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController  // @Controller  + @ResponseBody
@RequestMapping("employees")
public class EmployeeController {
    @GetMapping
    public List<Employee> list(){
        List<Employee> list = Arrays.asList(new Employee(1L, "dafei", 18), new Employee(2L, "xiaofei", 17));
        return list;
    }
    @GetMapping("/{id}")
    public Employee detail(@PathVariable Long id){
        return new Employee(id, "dafei", 18);
    }

    @PostMapping
    public Employee save(Employee employee){
        employee.setId(1L);
        return employee;
    }
    @PutMapping
    public Employee update(Employee employee){
        employee.setName(employee.getName() + "_update");
        return employee;
    }
    @DeleteMapping
    public JsonResult delete(Long id){
        return JsonResult.success();
    }
}
