package com.electronic.store.services;

import com.electronic.store.dtos.PageableResponse;
import com.electronic.store.dtos.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto userDto, String userId);
    void deleteUser(String userId);
    PageableResponse<UserDto> getAllUser(int pageNumber, int pageSize, String sortBy, String sortDir);
    UserDto getUserById(String userId);
    UserDto getUserByEmail(String  email);
    List<UserDto> searchUser(String keywords);
}
