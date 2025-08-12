/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dreyyan
 */

public class Variables {
    /*
    name(string), age(int), grade(double), isEnrolled(boolean)
    initialize with sample data
    print using println
    */
    
    public static void main(String[] args) {
        String name = "Adrian";
        int age = 20;
        double grade = 98;
        boolean isEnrolled = true;
        
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Grade:" + grade);
        System.out.println("Enrolled:" + (isEnrolled ? "Yes" : "No"));
    }
}