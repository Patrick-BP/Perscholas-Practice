package org.example;

import com.perscholas.controller.EmployeController;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {

        System.out.println( "Hello World!" );
        EmployeController e = new EmployeController();
        //e.createEmployeeTable();
        //e.findEmployeeByname();
        //e.findEmployeeById();
        e.ShowOfficeCodes_AsDepartment();


    }
}