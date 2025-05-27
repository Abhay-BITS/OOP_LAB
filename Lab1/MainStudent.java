package Lab2;

public class MainStudent {

    public static void main(String args[]) {
        // Create an array of 6 Student objects and initialize them with name, ID, CGPA, and campus
        Student students[] = new Student[6];
        students[0] = new Student("Simran", "2020PS1934H", 8.65, "Pilani");
        students[1] = new Student("Raj", "2020PS8695H", 8.24, "Hyd");
        students[2] = new Student("Rahul", "2020PS6932P", 7.21, "GOA");
        students[3] = new Student("Soniya", "2020PS1748P", 9.2, "GOA");
        students[4] = new Student("Veer", "2020PS3874G", 8.7, "HYD");
        students[5] = new Student("Zaara", "2020PS3225G", 8.7, "pilani");

        // Sort students by CGPA in ascending order ("A" = Ascending, "D" = Descending)
        sort(students, "A");

        // Display the sorted student data in tabular format
        System.out.println("ID\t\tName\t\tCGPA\t\tCampus");
        for (Student s : students) {
            System.out.printf("%s\t%s\t\t%.2f\t\t%s\n", s.ID, s.name, s.CGPA, s.Campus);
        }
    }

    /
      Sorts the student array based on CGPA using Bubble Sort.
      @param students The array of Student objects to sort.
      @param direction "A" for ascending, "D" for descending order of CGPA.
     /
    public static void sort(Student[] students, String direction) {
        // Bubble Sort logic
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {

                // If sorting in ascending order and current CGPA is greater than next, swap them
                if (direction.equalsIgnoreCase("A") && students[j].CGPA > students[j + 1].CGPA) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;

                // If sorting in descending order and current CGPA is less than next, swap them
                } else if (direction.equalsIgnoreCase("D") && students[j].CGPA < students[j + 1].CGPA) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
