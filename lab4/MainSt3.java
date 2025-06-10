import java.util.Scanner;

public class MainSt3 {
    public static void main(String[] args) {
        BITSStudent studentBand[] = new BITSStudent[9];
        studentBand[0] = new FDStudent("Noori", "2020PS4576H", "CS", "96", "2000");
        studentBand[1] = new FDCode("Rohit", "2020PS9876H", "Mech", "98", "UGNS",3,"C","C++","python");
        studentBand[2] = new FDCodeRobo("Sayani", "2020PS3645H", "Eco", "94", "UG",2,3,new String[]{"C","Matlab"},"Drones","humanoids");
        studentBand[3] = new HDStudent("Maya", "2023TS7656H", "CS", "92,8.45", "PG");
        studentBand[4] = new HDStudent("Kalki", "2023TS8765H", "EC", "91,7.92", "PGGate");
        studentBand[5] = new HDStudent("Harsh", "2023TS3517H", "Math", "97,9.4", "20000");
        studentBand[6] = new PHDStudent("Kavan", "20211540", "Physics", "Prof. Rishikesh Vaidya, Prof. Madhukar Mishra", "93.2,7.05,9.05", "Therapy using AI and VR");
        studentBand[7] = new FDRoboMusic("Shubhayu", "2021B3AA0000P", "ECE", "98", "UG", 3, 3, new String[] {"Guitar", "Sitar"}, "Drone", "humanoids");
        studentBand[8] = new HDCodeMusic("Test", "2021B3A40000P", "Mechanical", "98, 8.45", "PG", 3, 3, new String[]{"C", "Matlab"}, "Guitar", "Sitar");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("What name do you want?");
        // String key = sc.nextLine();
        // Boolean found = false;
        // for(BITSStudent student:studentBand){
        //     if(!found){
        //         if(key.equalsIgnoreCase(student.name)){
        //             System.out.println("The student details are: \n");
        //             student.printDetails();
        //             found = true;
        //             continue;
        //         }
        //     }
        // }
        // if(!found){
        //     System.out.println("Sorry this student does not exist!");
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("12th marks threshold?");
        // Double key = sc.nextDouble();
        // Boolean found = false;
        // for(BITSStudent student:studentBand){
        //         if(key <= (Global.getSchoolPercentage(student.qualification))){
        //             // System.out.println("The student details are: \n");
        //             System.out.println("\n");
        //             student.printDetails();
        //             System.out.println("***********************************************\n");
        //             // found = true;
        //             // continue;
        //         }
        // }
        // if(!found){
        //     System.out.println("Sorry this student does not exist!");
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of Student:");
        String key = sc.nextLine();
        Boolean found = true;
        for(BITSStudent student:studentBand) {
            if (key.equalsIgnoreCase(student.name)){
                // System.out.println("The student is a part of " + Global.printList("club", ));
                String[] Clubs = {};
                if (student instanceof FDCodeRobo) {
                    Clubs = new String[] {"Coding Club", "Robotic Club"};
                } else if (student instanceof FDRoboMusic) {
                    Clubs = new String[] {"Robotics Club", "Music Club"};
                } else if (student instanceof HDCodeMusic) {
                    Clubs = new String[] {"Coding Club", "Music Club"};
                } else if (student instanceof FDCode) {
                    Clubs = new String[] {"Coding Club"};
                }

                if (Clubs.length <= 0) {
                    System.out.println("He is not a part of any club.");
                } else {
                    System.out.println("The student is a part of " + Global.printList("club", Clubs));
                }
            }
        }
    }
}
