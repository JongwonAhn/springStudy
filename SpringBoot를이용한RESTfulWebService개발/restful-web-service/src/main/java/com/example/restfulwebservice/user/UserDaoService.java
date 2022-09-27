package com.example.restfulwebservice.user;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDaoService {
    //이번 강의에서는 RDBS를 사용하지 않으므로, DaoService로 만듦.
    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;

    static {
        users.add(new User(1, "Jongwon", new Date(), "pass1", "701010-111111"));
        users.add(new User(2, "Aaron", new Date(), "pass2", "701010-222222"));
        users.add(new User(3, "Maro", new Date(), "pass3", "701010-333333"));
    }

    public List<User> findAll(){
        return users;
    }
    
    public User save(User user){
        if(user.getId() == null){
            user.setId(++userCount);
        }

        users.add(user);
        return user;
    }

    public User findOne(int id){
        for (User user: users) {
            if(user.getId() == id){
                return user;
            }
        }

        return null;
    }

    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()){
            User user = iterator.next();

            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
