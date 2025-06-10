import java.util.ArrayList;
import java.util.List;
public class UpdatedMainExample {
    public static void main(String[] args) {
        // Create courses
        Course ml = new Course("Machine Learning", "BITS F441", false, false, 3);
        Course oop = new Course("Object Oriented Programming", "CS F213", true, true, 4);
        Course math = new Course("Mathematics", "MATH F111", true, false, 3);
        
        // Create students using different constructors
        
        // Basic constructor
        FDStudent student1 = new FDStudent("Alice", "2020PS1111H", Major.Computer_Science, "95", "UG");
        
        // Constructor with single course
        FDStudent student2 = new FDStudent("Bob", "2020PS2222H", Major.Mechanical, "92", "UGNS", ml);
        
        // Constructor with multiple courses (varargs)
        HDStudent student3 = new HDStudent("Charlie", "2023TS3333H", "CS", "90,8.5", "PG", oop, math);
        
        // Constructor with course list
        List<Course> courseList = new ArrayList<>();
        courseList.add(ml);
        courseList.add(oop);
        FDStudent student4 = new FDStudent("Diana", "2020PS4444H", Major.Electronics, "88", "UG", courseList);
        
        // Add courses after creation
        student1.addCourse(math);
        student1.addCourse(oop);
        
        // Print student details
        student1.printDetails();
        student2.printDetails();
        student3.printDetails();
        student4.printDetails();
    }
}


/*
 * import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumCourseExample {
    public static void main(String[] args) {
        
        // Method 1: Create students with enum courses using varargs
        FDStudent student1 = new FDStudent("Alice", "2020PS1111H", Major.Computer_Science, "95", "UG", 
            CourseType.OBJECT_ORIENTED_PROGRAMMING, CourseType.MATHEMATICS_I, CourseType.MACHINE_LEARNING);
        
        // Method 2: Create student with single enum course
        HDStudent student2 = new HDStudent("Bob", "2023TS2222H", "CS", "90,8.5", "PG", 
            CourseType.ARTIFICIAL_INTELLIGENCE);
        
        // Method 3: Create student with enum course list
        List<CourseType> courseList = Arrays.asList(
            CourseType.DATA_STRUCTURES_ALGORITHMS, 
            CourseType.DATABASE_SYSTEMS,
            CourseType.COMPUTER_NETWORKS
        );
        FDStudent student3 = new FDStudent("Charlie", "2020PS3333H", Major.Computer_Science, "92", "UG", courseList);
        
        // Method 4: Add courses after creation using enum
        FDStudent student4 = new FDStudent("Diana", "2020PS4444H", Major.Electronics, "88", "UGNS");
        student4.addCourse(CourseType.DIGITAL_DESIGN);
        student4.addCourse(CourseType.MICROPROCESSORS);
        student4.addCourses(CourseType.MATHEMATICS_I, CourseType.TECHNICAL_REPORT_WRITING);
        
        // Method 5: Browse all available courses
        System.out.println("Available Courses:");
        for (CourseType courseType : CourseType.values()) {
            System.out.println("- " + courseType.getName() + " (" + courseType.getCode() + ") - " 
                + courseType.getCredits() + " credits");
        }
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Print student details
        student1.printDetails();
        student2.printDetails();
        student3.printDetails();
        student4.printDetails();
    }
}

 */




 /*
  * import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseSearchExample {
    // Store all courses in a list for easy searching
    private static List<Course> allCourses = new ArrayList<>();
    
    public static void main(String[] args) {
        // Initialize your existing student data
        BITSStudent studentBand[] = new BITSStudent[7];
        studentBand[0] = new FDStudent("Noori", "2020PS4576H", Major.Computer_Science, "96", "2000");
        studentBand[1] = new FDCode("Rohit", "2020PS9876H", Major.Mechanical, "98", "UGNS", 3, "C", "C++", "python");
        studentBand[2] = new FDCodeRobo("Sayani", "2020PS3645H", Major.Mechanical, "94", "UG", 2, 3, new String[]{"C", "Matlab"}, "Drones", "humanoids");
        studentBand[3] = new HDStudent("Maya", "2023TS7656H", "CS", "92,8.45", "PG");
        studentBand[4] = new HDStudent("Kalki", "2023TS8765H", "EC", "91,7.92", "PGGate");
        studentBand[5] = new HDStudent("Harsh", "2023TS3517H", "Math", "97,9.4", "20000");
        studentBand[6] = new FDCodeRobo("Joseph", "2020PS9988H", Major.Computer_Science, "94", "UG", "1,2", new String[]{"C", "Python"}, "Drones", "Submarines");
        
        // Create courses and add to course list
        Course ml = new Course("Machine Learning", "BITS F441", false, false, 3);
        Course oop = new Course("Object Oriented Programming", "CS F213", true, true, 4);
        Course math = new Course("Mathematics", "MATH F111", true, false, 3);
        Course networks = new Course("Computer Networks", "CS F303", true, false, 3);
        Course database = new Course("Database Systems", "CS F212", true, true, 3);
        
        // Add courses to the global list
        allCourses.add(ml);
        allCourses.add(oop);
        allCourses.add(math);
        allCourses.add(networks);
        allCourses.add(database);
        
        // Register students to courses
        ml.addStudent(studentBand[0]);
        ml.addStudent(studentBand[1]);
        ml.addStudent(studentBand[3]);
        ml.addStudent(studentBand[6]);
        
        oop.addStudent(studentBand[0]);
        oop.addStudent(studentBand[3]);
        oop.addStudent(studentBand[2]);
        oop.addStudent(studentBand[6]);
        
        math.addStudent(studentBand[4]);
        math.addStudent(studentBand[5]);
        math.addStudent(studentBand[1]);
        
        networks.addStudent(studentBand[3]);
        networks.addStudent(studentBand[6]);
        
        // Start the course search functionality
        searchCourseByCode();
    }
    
    public static void searchCourseByCode() {
        Scanner sc = new Scanner(System.in);
        String continueSearch = "Y";
        
        while (continueSearch.equalsIgnoreCase("Y")) {
            System.out.println("\n" + "=".repeat(60));
            System.out.println("              COURSE ENROLLMENT SEARCH");
            System.out.println("=".repeat(60));
            
            // Display available courses
            System.out.println("\nAvailable Courses:");
            for (Course course : allCourses) {
                System.out.printf("- %-8s : %s\n", course.getCode(), course.getName());
            }
            
            System.out.print("\nEnter course code: ");
            String courseCode = sc.nextLine().trim();
            
            Course foundCourse = findCourseByCode(courseCode);
            
            if (foundCourse != null) {
                displayCourseEnrollment(foundCourse);
            } else {
                System.out.println("\n❌ Sorry! Course with code '" + courseCode + "' does not exist!");
                System.out.println("Please check the available course codes above.");
            }
            
            System.out.print("\nDo you want to search for another course? (Y/N): ");
            continueSearch = sc.nextLine().trim();
        }
        
        System.out.println("\nThank you for using the Course Enrollment Search!");
        sc.close();
    }
    
    public static Course findCourseByCode(String courseCode) {
        for (Course course : allCourses) {
            if (course.getCode().equalsIgnoreCase(courseCode)) {
                return course;
            }
        }
        return null;
    }
    
    public static void displayCourseEnrollment(Course course) {
        List<BITSStudent> students = course.getStudentList();
        
        System.out.println("\n" + "=".repeat(80));
        System.out.printf("Course: %s (%s)\n", course.getName(), course.getCode());
        System.out.println("Credits: " + course.getCredits() + " | CDC: " + (course.isCDC() ? "Yes" : "No") + " | Lab: " + (course.hasLab() ? "Yes" : "No"));
        System.out.println("=".repeat(80));
        
        if (students.isEmpty()) {
            System.out.println("No students are currently enrolled in this course.");
        } else {
            System.out.printf("Total Enrolled Students: %d\n\n", students.size());
            
            // Print table header
            System.out.printf("%-4s | %-25s | %-15s | %-12s | %-35s\n", 
                "S.No", "Student Name", "Student ID", "Type", "Email");
            System.out.println("-".repeat(95));
            
            // Print student details
            int serialNo = 1;
            for (BITSStudent student : students) {
                String studentType = getStudentType(student);
                System.out.printf("%-4d | %-25s | %-15s | %-12s | %-35s\n", 
                    serialNo++, 
                    student.name, 
                    student.ID, 
                    studentType,
                    student.email);
            }
            
            System.out.println("-".repeat(95));
            
            // Additional statistics
            displayEnrollmentStatistics(students);
        }
    }
    
    public static String getStudentType(BITSStudent student) {
        if (student instanceof FDCodeRobo) {
            return "FD-Code-Robo";
        } else if (student instanceof FDCode) {
            return "FD-Code";
        } else if (student instanceof FDStudent) {
            return "FD Student";
        } else if (student instanceof HDStudent) {
            return "HD Student";
        }
        return "Unknown";
    }
    
    public static void displayEnrollmentStatistics(List<BITSStudent> students) {
        int fdCount = 0, hdCount = 0, codingClubCount = 0, roboticsClubCount = 0;
        
        for (BITSStudent student : students) {
            if (student instanceof FDStudent) {
                fdCount++;
            } else if (student instanceof HDStudent) {
                hdCount++;
            }
            
            if (student instanceof CodingClubMember) {
                codingClubCount++;
            }
            
            if (student instanceof RoboticsClubMember) {
                roboticsClubCount++;
            }
        }
        
        System.out.println("\n📊 Enrollment Statistics:");
        System.out.printf("• FD Students: %d\n", fdCount);
        System.out.printf("• HD Students: %d\n", hdCount);
        System.out.printf("• Coding Club Members: %d\n", codingClubCount);
        System.out.printf("• Robotics Club Members: %d\n", roboticsClubCount);
    }
}

  */
