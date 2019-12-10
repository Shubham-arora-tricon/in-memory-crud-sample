package com.triconinfotech.inmemoryCRUD.service;

import com.triconinfotech.inmemoryCRUD.dao.Repository1;
import com.triconinfotech.inmemoryCRUD.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
