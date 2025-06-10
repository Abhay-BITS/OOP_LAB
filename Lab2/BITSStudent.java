package lab2;

public abstract class BITSStudent {
    String name;
    String ID;
    String email;
    String qualification;
    int stipend;
    public abstract void setQualification(String q); //enforces dvelopers to complete this function
    public abstract void setScholarship(String stipendClass); 
    public abstract void printDetails();
}


