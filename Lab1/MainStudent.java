public class MainStudent {

    public static void main(String args[]) {
        Student students[] = new Student[6];
        students[0] = new Student("Simran", "2020PS1934H", 8.65);
        students[1] = new Student("Raj", "2020PS8695H", 8.24);
        students[2] = new Student("Rahul", "2020PS6932P", 7.21);
        students[3] = new Student("Soniya", "2020PS1748P", 9.2);
        students[4] = new Student("Veer", "2020PS3874G", 8.7);
        students[5] = new Student("Zaara", "2020PS3225G", 8.7);

        // Example: sort by name in ascending order
        sort(students, "Campus", "A");

        System.out.println("ID\t\tName\t\tCGPA\t\tCampus");
        for (Student s : students) {
            System.out.printf("%s\t%s\t\t%.2f\t\t%s\n", s.ID, s.name, s.CGPA, s.Campus);
        }
    }

    public static void sort(Student[] students, String key, String direction) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                boolean shouldSwap = false;

                switch (key.toLowerCase()) {
                    case "cgpa":
                        if (direction.equalsIgnoreCase("A"))
                            shouldSwap = students[j].CGPA > students[j + 1].CGPA;
                        else
                            shouldSwap = students[j].CGPA < students[j + 1].CGPA;
                        break;

                    case "id":
                        if (direction.equalsIgnoreCase("A"))
                            shouldSwap = students[j].ID.compareToIgnoreCase(students[j + 1].ID) > 0;
                        else
                            shouldSwap = students[j].ID.compareToIgnoreCase(students[j + 1].ID) < 0;
                        break;

                    case "name":
                        if (direction.equalsIgnoreCase("A"))
                            shouldSwap = students[j].name.compareToIgnoreCase(students[j + 1].name) > 0;
                        else
                            shouldSwap = students[j].name.compareToIgnoreCase(students[j + 1].name) < 0;
                        break;

                    case "campus":
                        if (direction.equalsIgnoreCase("A"))
                            shouldSwap = students[j].Campus.compareToIgnoreCase(students[j + 1].Campus) > 0;
                        else
                            shouldSwap = students[j].Campus.compareToIgnoreCase(students[j + 1].Campus) < 0;
                        break;
                }

                if (shouldSwap) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
