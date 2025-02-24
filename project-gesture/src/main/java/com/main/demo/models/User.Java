package com.main.demo.models;
import jakarta.persistence.*;

@Entity
@Table(name = "utilisateurs")
Public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
Private String name;
Private String email;
Private String password;
Private String role;
Private String status;

public User(String name, String email, String password, String role, String status) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.role = role;
    this.status = status;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
public String getRole() {
    return role;
}
public void setRole(String role) {
    this.role = role;
}
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}
}
