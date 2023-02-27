package com.example.demo1.dto;

import com.example.demo1.model.customer.CustomerType;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CustomerDto {
    private  int id;
    @NotNull(message = "không được để trống")
    private  String name;
    @NotNull(message = "không được để trống")
    private String dateOfBirth;
    @NotNull(message = "không được để trống")
    @Pattern(regexp = "^[0-9]+$\n",message = "bắt buộc nhập số")
    private  int gender;
    @NotNull(message = "không được để trống")
    @Pattern(regexp = "^[0-9]+$\n",message = "Bắt buộc là số")
    private String idCard;
    @NotNull(message = "không được để trống")
    @Pattern(regexp = "^[0-9]+$\n",message = "Bắt buộc là số")
    private String phoneNUmber;
    @NotNull(message = "không được để trống")
    private String email;
    @NotNull(message = "không được để trống")
    private String address;

    private CustomerType customerType;

    public CustomerDto() {
    }

    public CustomerDto(int id, String name, String dateOfBirth, int gender, String idCard, String phoneNUmber, String email, String address, CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNUmber = phoneNUmber;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
