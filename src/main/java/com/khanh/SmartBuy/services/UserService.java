package com.khanh.SmartBuy.services;

import com.khanh.SmartBuy.dtos.LoginRequest;
import com.khanh.SmartBuy.dtos.RegisterRequest;
import com.khanh.SmartBuy.dtos.Response;
import com.khanh.SmartBuy.dtos.UserDTO;
import com.khanh.SmartBuy.models.User;

public interface UserService {

    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
