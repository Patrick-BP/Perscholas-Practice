package com.perscholas.GLAB981.SP14.service;


import com.perscholas.GLAB981.SP14.DTO.UserDTO;
import com.perscholas.GLAB981.SP14.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public UserDetails loadUserByUsername(String userName);
    public void creat(UserDTO userDTO);
    public User findUserByEmail(String email);
    public User findUserByName(String name);
}

