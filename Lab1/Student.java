//Write a student class and a main to create some students and irerate through them, we will also use a basic constructor to ease our job
//class name in capital

package Lab2;

public class Student {
    String name;
    String ID;
    Double CGPA;
    String Campus;
    public Student(String n, String i, double c, String t){  // constructor to do smart work
        this.name = n;
        this.ID = i;
        this.CGPA = c;
        this.Campus = t;
    }
}

