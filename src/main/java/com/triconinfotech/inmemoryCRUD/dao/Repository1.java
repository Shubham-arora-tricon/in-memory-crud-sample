package com.triconinfotech.inmemoryCRUD.dao;

import com.triconinfotech.inmemoryCRUD.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Repository
public class Repository1 {
    List<User> listOfUser = new ArrayList<>();

    public List<User> findAll() {
        return listOfUser;
    }

    public String save(User user) {
        listOfUser.add(user);
        return "Congrats You have added to the application successfully";
    }

    public String deleteByName(String userName) {
        ListIterator<User> itr = listOfUser.listIterator();
        int flag = 0, counter = 0;
        while(itr.hasNext()) {
            User user = itr.next();
            String actualUserName = user.getUserName();
            if(actualUserName.equals(userName)) {
                flag = 1;
                itr.remove();
                counter++;
            }
        }
        if(flag == 0){
            return "Sorry, the user you are trying to delete is not found";
        }
        return "Congrats, "+counter+" User(s) with name "+userName+"is Successfully Deleted";
    }

    public String updateDetailByName(User user) {
        ListIterator<User> itr = listOfUser.listIterator();
        int flag = 0;
        while(itr.hasNext()) {
            User user1 = itr.next();
            if(user.getUserName().equals(user1.getUserName())){
                itr.remove();
                flag = 1;
            }
        }
        if(flag == 1) {
            listOfUser.add(user);
            return "Congrats user updated";
        }
        return "Sorry, the user you want to update is not found";
    }
}
