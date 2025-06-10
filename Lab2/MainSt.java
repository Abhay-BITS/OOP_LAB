package lab2;

public class MainSt {
    public static void main(String[] args) {
        FDStudent s1 = new FDStudent("Noori", "2020PS4576H", "CS", "96", "2000");
        FDStudent s2 = new FDStudent("Rohit", "2020PS9876H", "Mech", "98", "UGNS");
        FDStudent s3 = new FDStudent("Sayani", "2020PS3645H", "Eco", "94", "UG");
        HDStudent S1 = new HDStudent("Maya", "2023TS7656H", "CS", "92,8.45", "PG");
        HDStudent S2 = new HDStudent("Kalki", "2023TS8765H", "EC", "91.7,92", "PGGate");
        HDStudent S3 = new HDStudent("Harsh", "2023TS3517H", "Math", "97,9.4", "20000");
        PHDScholar p1= new PHDScholar("Rohan", "2022PX0519H", "Molecular biology", "89, 7.7, 9.1", "MTech", "Prof. Lakshman Bhatia, and Prof. Ajit Pandey");
        System.out.println("\n********\n");
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
        S1.printDetails();
        S2.printDetails();
        S3.printDetails();
        p1.printDetails();
    }
}

