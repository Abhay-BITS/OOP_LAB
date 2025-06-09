//Write a student class and a main to create some students and irerate through them, we will also use a basic constructor to ease our job
//class name in capital

public class Student {
    String name;
    String ID;
    double CGPA;
    String Campus;

    // Constructor
    public Student(String name, String ID, double CGPA) {
        this.name = name;
        this.ID = ID;
        this.CGPA = CGPA;
        this.Campus = assignCampus(ID);
    }

    // Method to assign campus from last char of ID
    private String assignCampus(String id) {
        char lastChar = Character.toUpperCase(id.charAt(id.length() - 1));
        if (lastChar == 'H') return "Hyd";
        else if (lastChar == 'P') return "Pilani";
        else if (lastChar == 'G') return "Goa";
        else return "Unknown";
    }
}
