package com.eltex;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private long nextId = 1L;
    private final List<User> users = new ArrayList<>();

    public void save(final User user){
        if(user.id() == 0){     //new id
            users.add(user.builder().setId(nextId++).build());
        } else {    //update id and rechange
            for(int i=0; i < users.size(); i++){
                if(users.get(i).id() == user.id()){
                    users.set(i, user);
                    return;
                }
            }
        }
    }

    public void removeById(final long userId){
        users.removeIf(user -> user.id() == userId);
    }

    public User getById(final long userId){
        for(User user : users){
            if(user.id() == userId)
                return user;
        }
        throw new NotFoundException();
    }

    public List<User> getAll(){
        return new ArrayList<>(users);
    }
}
