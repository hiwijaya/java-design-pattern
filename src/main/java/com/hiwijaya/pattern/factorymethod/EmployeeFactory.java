package com.hiwijaya.pattern.factorymethod;

public class EmployeeFactory {

    private static final String MANAGER = "MANAGER";
    private static final String STAFF = "STAFF";


    public static Employee createManager(String name){
        return new Employee(name, MANAGER, 10000000L);
    }

    public static  Employee createStaff(String name){
        return new Employee(name, STAFF, 5000000L);
    }

}

class Main {

    public static void main(String[] args) {

        Employee manager1 = EmployeeFactory.createManager("Happy Indra Wijaya");
        Employee staff1 = EmployeeFactory.createStaff("John Doe");


    }
}
