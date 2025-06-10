import java.util.List;
public class FDStudent extends BITSStudent {
    Major major;
    double schoolFinalPercentage;

    // Constructor 1: Basic constructor
    public FDStudent(String name, String ID, Major major, String sfP, String stipend) {
        super(); // Initialize courses list
        this.name = name;
        this.ID = ID;
        this.email = "f" + ID + "@hyderabad.bits-pilani.ac.in";
        this.major = major;
        setScholarship(stipend);
        setQualification(sfP);
    }
    
    // Constructor 2: With single course
    public FDStudent(String name, String ID, Major major, String sfP, String stipend, Course course) {
        this(name, ID, major, sfP, stipend);
        addCourse(course);
    }
    
    // Constructor 3: With multiple courses
    public FDStudent(String name, String ID, Major major, String sfP, String stipend, List<Course> courses) {
        this(name, ID, major, sfP, stipend);
        for (Course course : courses) {
            addCourse(course);
        }
    }
    
    // Constructor 4: With course array (varargs)
    public FDStudent(String name, String ID, Major major, String sfP, String stipend, Course... courses) {
        this(name, ID, major, sfP, stipend);
        for (Course course : courses) {
            addCourse(course);
        }
    }

    public void setQualification(String q) {
        this.schoolFinalPercentage = Double.parseDouble(q);
    }

    public void setScholarship(String stipendClass) {
        if (stipendClass.equals("UGNS"))
            super.stipend = 0;
        else if (stipendClass.equals("UG"))
            super.stipend = 8000;
        else
            super.stipend = Integer.parseInt(stipendClass);
    }

    public void printDetails() {
        String stipendDetails = "";
        if (super.stipend == 0)
            stipendDetails = "receives no scholarship";
        else
            stipendDetails = "receives a scholarship of " + super.stipend + " per month.";
            
        System.out.println(super.name + " is a FD student with major in " + this.major + "\n"
                + "The id of the student is " + super.ID + " and email is " + super.email + "\n"
                + "The student got " + this.schoolFinalPercentage + "/% marks in 12th and "
                + stipendDetails);
        
        // Print enrolled courses
        if (!enrolledCourses.isEmpty()) {
            System.out.println("Enrolled Courses:");
            for (Course course : enrolledCourses) {
                System.out.println("- " + course.getName() + " (" + course.getCode() + ") - " 
                    + course.getCredits() + " credits");
            }
            System.out.println("Total Credits: " + getTotalCredits());
        }
        System.out.println();
    }
}
