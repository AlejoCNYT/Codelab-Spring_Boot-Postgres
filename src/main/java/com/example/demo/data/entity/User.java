package com.example.demo.data.entity;

import com.example.demo.data.dto.UserDto;
import jakarta.persistence.*; // cambia a javax.persistence.* si usas Boot 2.x

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    public User() { }

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User(UserDto userDto) {
        this.name = userDto.getName();
        this.email = userDto.getEmail();
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}
