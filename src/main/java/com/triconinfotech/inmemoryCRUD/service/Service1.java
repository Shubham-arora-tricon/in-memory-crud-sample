package com.triconinfotech.inmemoryCRUD.service;

import com.triconinfotech.inmemoryCRUD.dao.Repository1;
import com.triconinfotech.inmemoryCRUD.entity.User;
import com.triconinfotech.inmemoryCRUD.entity.student.SchoolInfo;
import com.triconinfotech.inmemoryCRUD.entity.student.StudentRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

@Service
public class Service1 {

    @Autowired
    private Repository1 repository1;

    public void getUserDetailsByUserName() {

    }

    public List<User> getAllUserDetails() {
        return repository1.findAll();
    }

    public String addUserDetail(User user) {
        return repository1.save(user);
    }

    public String deleteUser(String userName) {
        return repository1.deleteByName(userName);
    }

    public String updateUserdetails(User user) {
        return repository1.updateDetailByName(user);
    }

    public OptionalInt addSchool(SchoolInfo schoolInfo) {
        try{
            /*final StudentRecord[] studentRecords = schoolInfo.getAllStudentRecord().getStudentRecords();
            final List<StudentRecord> collect = Arrays.stream(studentRecords)
                    .filter(StudentRecord::isMonitor)
                    .collect(Collectors.toList())
                    ;
            int firstDate = collect.get(0).getFirstDate();
            final int firstDate2 = Arrays.stream(collect.get(0).getFullRecord().getRecords())
                    .filter(record -> record.getId() == "isMonitor")
                    .collect(Collectors.toList())
                    .get(0)
                    .getValue();
            if(firstDate2 > firstDate){
                firstDate = firstDate2;
            }
            return OptionalInt.of(firstDate);*/
            schoolInfo.getAllStudentRecord().getStudentRecords().stream().filter(si->si.isMonitor());
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
