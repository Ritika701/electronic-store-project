package com.electronic.store.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity //represent table in db
@Table(name = "users") //create table named users
public class User {

    @Id //userId - Primary key
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    private String userId;

    @Column(name = "user_name") //to change the name of the column in table
    private String name;

    @Column(name="user_email", unique = true)
    private String email;

    @Column(name = "user_password", length = 10)
    private String password;

    private String gender;

    @Column(length = 1000)
    private String about;

    @Column(name = "user_image_name")
    private String imageName;
}
