package lab2;

public class Student {
    private String name;
    private String ID;
    private double CGPA;
    private Address address;

    public Student(String n, String i, double c, Address a){
        this.name = n;
        this.ID = i;
        this.CGPA = c;
        this.address= a;
    }

    public String getName(){
        return this.name;
    }

    public String getID(){
        return this.ID;
    }

    public double getCGPA(){
        return this.CGPA;
    }

    public String getStudentPincode(){
        return this.address.getPinCode();
    }
    public String getStudentState(){
        return this.address.getState();
    }
}

