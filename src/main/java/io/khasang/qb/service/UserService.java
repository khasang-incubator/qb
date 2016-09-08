//package io.khasang.qb.service;
//
//import io.khasang.helpdesk.db.UserDAO;
//import io.khasang.helpdesk.entities.User;
//import io.khasang.helpdesk.enums.Role;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Component("UserService")
//@Transactional
//public class UserService {
//    @Autowired
//    UserDAO userDAO;
//
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//    public List<User> getUserList() {
//        return userDAO.getUserList();
//    }
//
//    public void addUser(User user) {
//        if (user.getPassword() == null || user.getPassword().isEmpty()) {
//            throw new IllegalArgumentException("Please, enter password!");
//        }
//        encryptPassword(user);
//        userDAO.addUser(user);
//    }
//
//    public void updateUser(User user) {
//        if (user.getPassword() != null && !user.getPassword().isEmpty()) {
//            encryptPassword(user);
//        }
//        userDAO.updateUser(user);
//    }
//
//    public void deleteUser(User user) {
//        userDAO.deleteUser(user);
//    }
//
//    private void encryptPassword(User user) {
//        final String password = passwordEncoder.encode(user.getPassword());
//        user.setPassword(password);
//    }
//
//    public void deleteAllUsers() {
//        userDAO.deleteAllUsers();
//    }
//
//    public User getUserById(int id) {
//        return userDAO.getUserById(id);
//    }
//
//    public User getUserByLogin(String login) {
//        return userDAO.getUserByLogin(login);
//    }
//
//    public List<User> getUsersByRole(Role role) {
//        return userDAO.getUsersByRole(role);
//    }
//
//}
