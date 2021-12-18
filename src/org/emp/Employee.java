package org.emp;

public class Employee {
    private void empId(){
        System.out.println("empid:1");
    }
    private void empName(){
        System.out.println("empName: sam");
    }
    private void empDob(){
        System.out.println("empDob:1.1.1990");
    }
    private void empPhone(){
        System.out.println("empphone:12345677");
    }
    private void empEmail(){
        System.out.println("empEmail:xyz@gmail");
    }
    private void empAddress(){
        System.out.println("empAddress:chennai");
    }

    public static void main(String[] args) {
        Employee e= new Employee();
        e.empId();
        e.empName();
        e.empDob();
        e.empPhone();
        e.empEmail();
        e.empAddress();
    }
}
