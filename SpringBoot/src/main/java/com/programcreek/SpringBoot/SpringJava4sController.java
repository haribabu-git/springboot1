package com.programcreek.SpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programcreek.model.Student;
import com.programcreek.repository.SpringJava4sDAO;

@RestController
public class SpringJava4sController {
	@Autowired
    public SpringJava4sDAO dao;

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Tutorials";
	}
	
	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
	}
	
	

    @RequestMapping("/getStudentInfo")
    public List<Student> customerInformation() {
        List<Student> customers = dao.isData(); 
        return customers;
    }
    @RequestMapping("/getStudentInfobyid/{id}")
    public List<Student> customerInformation(@PathVariable String id) {
    	System.out.println(id);
        List<Student> customers = dao.getStudentDataById(id); 
        return customers;
    }
}