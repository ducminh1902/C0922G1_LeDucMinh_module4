package com.example.demo1.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerDto {
    private  int id;
    private int customerTypeId;

    @NotEmpty(message = "vui lòng điền thông tin")
    private  String name;

    @NotEmpty(message = "vui lòng điền thông tin")
    @Pattern(regexp = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$\n",message = "phải đúng định dạng DD/MM/YYYY")
    private String dateOfBirth;

    private  int gender;

    @NotEmpty(message = "vui lòng điền thông tin")
    @Pattern(regexp = "^[0-9]+$\n",message = "Id Card phải là dạng số")
    private String idCard;

    @NotEmpty(message = "vui lòng điền thông tin")
    @Size(min = 11 , max = 11,message = "PhoneNumber phải có 11 số")
    @Pattern(regexp = "^[0-9]+$\n", message = "PhoneNumber phải là dạng số ")
    private String phoneNUmber;

    @NotEmpty(message = "vui lòng điền thông tin")
    private String email;

    @NotEmpty(message = "vui lòng điền thông tin")
    private String address;

    public CustomerDto() {
    }

    public CustomerDto(int id, int customerTypeId, String name, String dateOfBirth, int gender, String idCard, String phoneNUmber, String email, String address) {
        this.id = id;
        this.customerTypeId = customerTypeId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNUmber = phoneNUmber;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
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
}
