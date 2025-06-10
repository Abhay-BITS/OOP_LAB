package lab2;

// Make a PHDScholar class which will have no major but a topic and there will a
// department. Also they will have one or multiple guide/guides.
// Then make entries for them in the main class and print their details. Also try this
// approach:


public class PHDScholar extends BITSStudent {
    String topic;
    String department;
    String guide;
    double schoolFinalPercentage;
    double graduationCGPA;
    double postgraduationCGPA;

    public void setQualification(String q) {
        String[] qArr = Global.getCGPAs(q);
        this.schoolFinalPercentage = Double.parseDouble(qArr[0]);
        this.graduationCGPA = Double.parseDouble(qArr[1]);
        this.postgraduationCGPA = Double.parseDouble(qArr[2]);
    }

    public void setScholarship(String stipendClass) {
        if (stipendClass.equals("MTech"))
            super.stipend = 25000;
        else if (stipendClass.equals("MTechTier1"))
            super.stipend = 30000;
        else
            super.stipend = Integer.parseInt(stipendClass);
    } //this is a complicated getter logic

    public void printDetails(){
        String stipendDetails = "";
        if(super.stipend==0)
            stipendDetails = "recieves no scholarship";
        else
            stipendDetails = "recives a scholarship of "+super.stipend+" per month.";
        System.out.println(super.name + " is a PhD student pursuing research in "+ this.topic + "\n"+"Under the guidance of professor "+ this.guide 
                           +". The id of the student is "+super.ID+" and email is "+super.email+"\n"
                           +"The student got "+this.schoolFinalPercentage+"% marks in 12th, and also achieved a cgpa of "+ this.graduationCGPA+ " in undergrad, and " + this.postgraduationCGPA + " in post graduation, and "
                           +stipendDetails+"\n");
    }

    public PHDScholar(String name, String ID, String topic, String sfP, String stipend, String guide){
        super.name = name;
        super.ID = ID;
        super.email = "f"+ID+"@hyderabad.bits-pilani.ac.in";
        this.topic = topic;
        this.guide = guide;
        setScholarship(stipend);;
        setQualification(sfP);
    }
}
