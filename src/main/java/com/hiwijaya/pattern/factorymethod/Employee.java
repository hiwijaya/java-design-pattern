package com.hiwijaya.pattern.factorymethod;

public class Employee {

    private String name;
    private String title;   // MANAGER, STAFF
    private Long salary;

    public Employee(String name, String title, Long salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

}
