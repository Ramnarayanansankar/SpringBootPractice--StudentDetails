package edu.uncc.masters.cs.dao;

import edu.uncc.masters.cs.model.Student;
import edu.uncc.masters.cs.utility.DbConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class AppDao {

    public LinkedList<Student> getStudentData(){

         Student student = null;
        String sql = "Select * from students";
        LinkedList<Student>studentList = new LinkedList<>();

        try{

            Connection conn = DbConnector.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                student = new Student();
                student.setStudentId(rs.getInt("student_id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setEmail(rs.getString("email"));
                student.setPhone(rs.getString("phone"));
                student.setAddress(rs.getString("address"));
                student.setEnrollmentDate(rs.getString("enrollment_date"));
                student.setCourse(rs.getString("course"));
                student.setGrade(rs.getString("grade"));
                student.setGpa(rs.getFloat("gpa"));
                studentList.add(student);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return studentList;
    }


}
