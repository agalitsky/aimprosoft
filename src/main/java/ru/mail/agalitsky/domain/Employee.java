package ru.mail.agalitsky.domain;

import java.util.Date;

/**
 * Объектное представление сущности Сотрудник.
 */
public class Employee {
    private Integer id = null;
    private int number;
    private String name;
    private String surname;
    private Date birthday;
    private String email;
    private Integer departmentId;

    public Employee(Integer id, int number, String name, String surname, Date birthday, String email, Integer departmentId) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.email = email;
        this.departmentId = departmentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}