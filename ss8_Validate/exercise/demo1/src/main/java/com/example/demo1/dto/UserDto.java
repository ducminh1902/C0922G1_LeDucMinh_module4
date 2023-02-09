package com.example.demo1.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class UserDto {

    private  int id;
    @Size(min = 5,max = 45,message = "tên ít nhất phải 5 chữ cái")
    private String name;
    @Size(min = 9,max = 12,message = "sdt ít nhất phải 9 số")
    private String phoneNumber;
    @Min(value = 18,message = "18 tuổi trở lên")
    private int age;
    @Size(min = 5,max = 45,message = "email ít nhất 5 chữ cái")
    private String email;

    public UserDto() {
    }

    public UserDto(int id, String name, String phoneNumber, int age, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
