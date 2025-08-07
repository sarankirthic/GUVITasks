package com.sarankirthic.task11.controller;

import com.sarankirthic.task11.entity.Employee;
import com.sarankirthic.task11.repository.EmployeeRepository;
import com.sarankirthic.task11.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @PostMapping("/addEmployee")
    public String saveEmployee(@ModelAttribute Employee employee, Model model) {
        service.saveEmployee(employee);
        model.addAttribute("message", "Employee has been saved successfully");
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @GetMapping("/displayAll")
    public String showAllEmployees(Model model) {
        List<Employee> employees = service.getAllEmployees();
        model.addAttribute("employees", employees);
        return "employeeList";
    }

    @GetMapping("/display/{id}")
    public String showEmployeeById(@PathVariable("id") String id, Model model) {
        Optional<Employee> employeeOpt = service.getEmployeeById(id);
        if (employeeOpt.isPresent()) {
            model.addAttribute("employee", employeeOpt.get());
            return "employeeDetails";
        } else {
            model.addAttribute("message", "Employee with id " + id + " not found");
            return "employeeDetails";
        }

    }
}
