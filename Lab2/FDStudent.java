package lab2;

public class FDStudent extends BITSStudent {
    String major;
    double schoolFinalPercentage;

    public void setQualification(String q) {
        this.schoolFinalPercentage = Double.parseDouble(q);  //built in function
    }

    public void setScholarship(String stipendClass) {
        if (stipendClass.equals("UGNS"))
            super.stipend = 0; //super is used because stipend is not a part of FD student but it is a part of BITSStudent (you are accessing one level above), also remember that you can access superclasss from subclass but not vice versa
        else if (stipendClass.equals("UG"))
            super.stipend = 8000;
        else
            super.stipend = Integer.parseInt(stipendClass);
    } //this is a complicated getter logic

    public void printDetails(){
        String stipendDetails = "";
        if(super.stipend==0)
            stipendDetails = "recieves no scholarship";
        else
            stipendDetails = "recives a scholarship of "+super.stipend+" per month.";
        System.out.println(super.name + " is a FD student with major in "+ this.major + "\n"
                           +"The id of the student is "+super.ID+" and email is "+super.email+"\n"
                           +"The student got "+this.schoolFinalPercentage+"/% marks in 12th and "
                           +stipendDetails+"\n");
    }

    public FDStudent(String name, String ID, String major, String sfP, String stipend){
        super.name = name;
        super.ID = ID;
        super.email = "f"+ID+"@hyderabad.bits-pilani.ac.in";
        this.major = major;
        setScholarship(stipend);;
        setQualification(sfP);
    }
}
