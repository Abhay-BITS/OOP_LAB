import java.util.List;
import java.util.ArrayList;

public abstract class BITSStudent {
    String name;
    String ID;
    String email;
    String qualification;
    int stipend;
    protected List<Course> enrolledCourses;
    public abstract void setQualification(String q); 
    public abstract void setScholarship(String stipendClass);
    public abstract void printDetails();

    public BITSStudent() {
        this.enrolledCourses = new ArrayList<Course>();
    }

     // Methods to manage courses
    public void addCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this); // Also add student to course
        }
    }
    public void removeCourse(Course course) {
        enrolledCourses.remove(course);
    }
    
    public List<Course> getEnrolledCourses() {
        return new ArrayList<>(enrolledCourses);
    }
    public int getTotalCredits() {
        return enrolledCourses.stream().mapToInt(Course::getCredits).sum();
    }
//     // Add course using enum
// public void addCourse(CourseType courseType) {
//     Course course = courseType.createCourse();
//     addCourse(course);
// }

// // Add multiple courses using enum varargs
// public void addCourses(CourseType... courseTypes) {
//     for (CourseType courseType : courseTypes) {
//         addCourse(courseType);
//     }
// }

// // Add multiple courses using enum list
// public void addCourses(List<CourseType> courseTypes) {
//     for (CourseType courseType : courseTypes) {
//         addCourse(courseType);
//     }
// }

}