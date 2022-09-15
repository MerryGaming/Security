package org.aibles.springjwt.service;

import org.aibles.springjwt.entity.User;

public interface UserService {

    User updateUser(int userId, User user);

    User deleteUser(int userId);


}


