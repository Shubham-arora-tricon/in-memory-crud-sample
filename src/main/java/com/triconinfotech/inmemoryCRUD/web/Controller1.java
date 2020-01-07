package com.triconinfotech.inmemoryCRUD.web;

import com.triconinfotech.inmemoryCRUD.entity.User;
import com.triconinfotech.inmemoryCRUD.entity.student.SchoolInfo;
import com.triconinfotech.inmemoryCRUD.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.OptionalInt;

@RestController
public class Controller1 {

    @Autowired
    private Service1 service1;

    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public List<User> getAllUserDetails() {
        return service1.getAllUserDetails();
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public String addUserDetail(@RequestBody User user) {
        return service1.addUserDetail(user);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    String deleteUser(@RequestBody String userName) {
        return service1.deleteUser(userName);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    String updateUserDetail(@RequestBody User user) {
        return service1.updateUserdetails(user);
    }

    @RequestMapping(value = "/v1", method = RequestMethod.POST)
    @ResponseBody
    public OptionalInt addUserDetail(@RequestBody SchoolInfo schoolInfo) {
        return service1.addSchool(schoolInfo);
    }
}
