package com.example.demo.EmployeeController;
import java.util.List;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping("/create")
    public void createEmployee(@RequestBody Employee employee){
        employeeRepository.insert(employee);


    }
    @PostMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable String id){
        employeeRepository.deleteById(id);

    }

    @GetMapping("/list")
    public List<Employee> listEmployee(){
        return employeeRepository.findAll();

    }

}
