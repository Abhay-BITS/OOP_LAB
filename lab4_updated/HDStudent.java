import java.util.List;
public class HDStudent extends BITSStudent {
    String major;
    double schoolFinalPercentage;
    double graduationCGPA;

    // Constructor 1: Basic constructor
    public HDStudent(String name, String ID, String major, String sfP, String stipend) {
        super(); // Initialize courses list
        this.name = name;
        this.ID = ID;
        this.email = "h" + ID + "@hyderabad.bits-pilani.ac.in";
        this.major = major;
        setScholarship(stipend);
        setQualification(sfP);
    }
    
    // Constructor 2: With single course
    public HDStudent(String name, String ID, String major, String sfP, String stipend, Course course) {
        this(name, ID, major, sfP, stipend);
        addCourse(course);
    }
    
    // Constructor 3: With multiple courses
    public HDStudent(String name, String ID, String major, String sfP, String stipend, List<Course> courses) {
        this(name, ID, major, sfP, stipend);
        for (Course course : courses) {
            addCourse(course);
        }
    }
    
    // Constructor 4: With course array (varargs)
    public HDStudent(String name, String ID, String major, String sfP, String stipend, Course... courses) {
        this(name, ID, major, sfP, stipend);
        for (Course course : courses) {
            addCourse(course);
        }
    }

    public void setQualification(String q) {
        String[] qArr = Global.getCGPAs(q);
        this.schoolFinalPercentage = Double.parseDouble(qArr[0]);
        this.graduationCGPA = Double.parseDouble(qArr[1]);
    }

    public void setScholarship(String stipendClass) {
        if (stipendClass.equals("PG"))
            super.stipend = 12000;
        else if (stipendClass.equals("PGGate"))
            super.stipend = 12500;
        else
            super.stipend = Integer.parseInt(stipendClass);
    }

    public void printDetails() {
        String stipendDetails = "";
        if (super.stipend == 0)
            stipendDetails = "receives no scholarship";
        else
            stipendDetails = "receives a scholarship of " + super.stipend + " per month.";
            
        System.out.println(super.name + " is a HD student with major in " + this.major + "\n"
                + "The id of the student is " + super.ID + " and email is " + super.email + "\n"
                + "The student got " + this.schoolFinalPercentage + "/% marks in 12th and "
                + this.graduationCGPA + " CGPA in graduation and "
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
//     // Constructor with single course enum
// public HDStudent(String name, String ID, String major, String sfP, String stipend, CourseType courseType) {
//     this(name, ID, major, sfP, stipend);
//     addCourse(courseType);
// }

// // Constructor with multiple course enums (varargs)
// public HDStudent(String name, String ID, String major, String sfP, String stipend, CourseType... courseTypes) {
//     this(name, ID, major, sfP, stipend);
//     addCourses(courseTypes);
// }

// // Constructor with list of course enums
// public HDStudent(String name, String ID, String major, String sfP, String stipend, List<CourseType> courseTypes) {
//     this(name, ID, major, sfP, stipend);
//     addCourses(courseTypes);
// }

}
