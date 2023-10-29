package com.electronic.store.dtos;

import com.electronic.store.validate.ImageNameValid;
import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private String userId;

    @Size(min=3, max=25, message="Invalid Name!!")
    private String name;

    @Email(message="Invalid User Email!!")
//    @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$n ", message = "Invalid User Email!!")
    @NotBlank(message = "Email is Req !!")
    private String email;

    @NotBlank(message ="Password is required !!")
    private String password;

    @Size(min=4, max=10, message = "Invalid gender !!")
    private String gender;

    @NotBlank(message = "write something about yourself!!")
    private String about;

    //custom validator
    @ImageNameValid
    private String imageName;
}
