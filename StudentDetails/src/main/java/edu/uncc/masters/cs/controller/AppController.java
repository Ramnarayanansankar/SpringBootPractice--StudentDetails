package edu.uncc.masters.cs.controller;

import edu.uncc.masters.cs.model.Student;
import edu.uncc.masters.cs.service.AppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/myStudentApp")
public class AppController {

    private AppService appService;


    public AppController(){
        this.appService = new AppService();
    }

    @GetMapping("/studentdetails")
    public List<Student> getStudentData(){
        return appService.getStudentData();
    }

    @Override
    public String toString() {
        return "AppController{" +
                "appService=" + appService +
                '}';
    }
}
