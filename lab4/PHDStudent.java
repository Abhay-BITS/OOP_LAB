public class PHDStudent extends BITSStudent {
    private String topic;
    private String department;
    private String[] guides;
    private String schoolFinalPercentage;
    private String graduationCGPA;
    private String mastersCGPA;

    public PHDStudent(String name, String id,String d, String g, String cg, String topic) {
        this.department = d;
        this.guides = Global.getCGPAs(g);
        super.name = name;
        super.ID = id;
        super.email = "f" + id + "@hyderabad.bits-pilani.ac.in";
        setQualification(cg);
        this.topic = topic;
    }

    public String getPHDStudentDepartment() {
        return department;
    }

    public String getMastersCGPA() {
        return mastersCGPA;
    }

    public String getSchoolCGPA() {
        return schoolFinalPercentage;
    }

    public String getTopic() {
        return topic;
    }

    public String getGraduationCGPA() {
        return graduationCGPA;
    }

    public String getPHDStudentGuides() {
        // List<String> list = Arrays.asList(guides);
        return String.join(",", this.guides);
    }

    public void setQualification(String q) {
        String[] qArr = Global.getCGPAs(q);
        this.schoolFinalPercentage = qArr[0];
        this.graduationCGPA = qArr[1];
        this.mastersCGPA = qArr[2];
        super.qualification = q;
    }

    public void setScholarship(String stipendClass) {
        if (stipendClass.equals("UGNS"))
            super.stipend = 0;
        else if (stipendClass.equals("UG"))
            super.stipend = 8000;
        else
            super.stipend = Integer.parseInt(stipendClass);
    }

    public void printDetails(){
        String stipendDetails = "";
        if(super.stipend==0)
            stipendDetails = "recieves no scholarship";
        else
            stipendDetails = "recives a scholarship of "+super.stipend+" per month.";
        System.out.println(super.name + " is a PHD in "+ this.getPHDStudentDepartment() + " department with the topic: " + this.getTopic() + ".\n"
                           +"The id of the student is "+super.ID+" and email is "+super.email+"\n"
                           +"The student is working under "+this.getPHDStudentGuides()+" and "
                           +stipendDetails+".\n"+"The student got "+ this.getSchoolCGPA()+ "% marks in 12th, " + this.getGraduationCGPA() + " CGPA in graduation and " + this.getMastersCGPA() + " CGPA in post-graduation.");
    }
}