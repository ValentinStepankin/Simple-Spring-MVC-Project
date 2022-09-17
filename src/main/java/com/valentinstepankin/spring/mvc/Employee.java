package com.valentinstepankin.spring.mvc;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    @Size(min = 1, message = "Name must be min 1 symbols")
    private String name;
    @NotBlank(message = "Surname is required field")
    private String surName;
    @Min(value = 0, message = "Salary cannot be less than 0")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String city;
    private Map<String, String> cities;
    private String[] languages;
    private Map<String, String> languagesList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Number must match xxx-xx-xx form")
    private String phoneNumber;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "IT");
        departments.put("HR", "HR");
        departments.put("Sales", "Sales");

        cities = new HashMap<>();
        cities.put("Vancouver", "Vancouver");
        cities.put("Toronto", "Toronto");

        languagesList = new HashMap<>();
        languagesList.put("English", "EN");
        languagesList.put("Deutsch", "DE");
        languagesList.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Map<String, String> getCities() {
        return cities;
    }

    public void setCities(Map<String, String> cities) {
        this.cities = cities;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
