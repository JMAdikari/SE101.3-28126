
package com.mycompany.employeemain;

public class Employee {
    
    int EmpNo;
    String EmpName;
    static String CompanyName="NSBM";
    public Employee(int e,String en)
    {
        EmpNo=e;
        EmpName=en;
        
    }
    public void display()
    {
        System.out.println("Employee Number"+ EmpNo);
        System.out.println("Employee Nmae"+EmpName);
        System.out.println("Company Nmae"+CompanyName);
        
    }
    
}
