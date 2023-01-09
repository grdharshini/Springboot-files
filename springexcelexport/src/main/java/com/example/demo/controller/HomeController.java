package com.example.demo.controller;

import com.example.demo.excel.UserExcelExporter;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/web")
public class HomeController {

    @RequestMapping("/home")
    public String homePage(){
        return "HomePage";
    }

    @Autowired
    private StudentRepository studentRepository;
    
    @PostMapping("/enterDetails")//http://localhost:8080/web/home/export/excel
    private String enterDetails(@RequestBody List<Student> studentList) {
    	 studentRepository.saveAll(studentList);
    	 return "saved successfully";
    }

    @GetMapping("/export/excel")
    private void exportToExcel(HttpServletResponse response) throws IOException{
        response.setContentType("application/octet-stream");
        String headerKey = "content_disposition";
        String headerValue = "attachment;filename=student_info.xlsx";

        response.setHeader(headerKey,headerValue);
        List<Student> studentList = studentRepository.findAll();
        UserExcelExporter exp = new UserExcelExporter(studentList);
        exp.export(response);
    }
}