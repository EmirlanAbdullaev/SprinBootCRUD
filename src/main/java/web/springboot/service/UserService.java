package web.springboot.service;

import web.springboot.model.User;

import java.util.List;

public interface UserService {
    public List<User> getUsersList();

    public void addUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
    public void update(User user);
}
