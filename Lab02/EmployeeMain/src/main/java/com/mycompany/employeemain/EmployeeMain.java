
package com.mycompany.employeemain;


public class EmployeeMain {

    public static void main(String[] args) {
      Employee e1=new Employee(4567,"Anne");
      e1.display();
      //static variable is accssesd thruogh a class name
      Employee.CompanyName="NSBM Green University";
      e1.display();
      
    }
}
