package com.programcreek.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.programcreek.model.Student;

@Repository
public class SpringJava4sDAO {

     @Autowired
     private JdbcTemplate jdbcTemplate;

     private static final String SQL = "select * from student";
     private static final String SQLById = "select * from student where stdentId=";

     public List<Student> isData() {

          List<Student> customers = new ArrayList<Student>();
          List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

          for (Map<String, Object> row : rows) 
          {
        	  Student student = new Student();
	        	  student.setStudentId((int)row.get("stdentId"));
	        	  student.setFirstName((String)row.get("firstname"));
	        	  student.setLanstName((String)row.get("lastname"));

               customers.add(student);
           }

         return customers;
     }
     
     public List<Student> getStudentDataById(String id) {

         List<Student> customers = new ArrayList<Student>();
         String query = SQLById+id;
         List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);

         for (Map<String, Object> row : rows) 
         {
       	  Student student = new Student();
	        	  student.setStudentId((int)row.get("stdentId"));
	        	  student.setFirstName((String)row.get("firstname"));
	        	  student.setLanstName((String)row.get("lastname"));

              customers.add(student);
          }

        return customers;
    }
}