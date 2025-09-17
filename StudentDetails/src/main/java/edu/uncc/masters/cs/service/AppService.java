package edu.uncc.masters.cs.service;

import edu.uncc.masters.cs.dao.AppDao;
import edu.uncc.masters.cs.model.Student;

import java.util.List;

public class AppService {

    private AppDao appdao;

    public AppService(){
        this.appdao =  new AppDao();
    }

    public List<Student> getStudentData(){
        return appdao.getStudentData();
    }

    @Override
    public String toString() {
        return "AppService{" +
                "appdao=" + appdao +
                '}';
    }
}
