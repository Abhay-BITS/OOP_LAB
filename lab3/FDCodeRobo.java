package lab3;

public class FDCodeRobo extends FDStudent implements CodingClubMember, RoboticsClubMember{
    private int codingClubRank;
    private int roboClubRank;
    private String[] robotTypes;
    private String[] languages;
    public FDCodeRobo(String n, String i, String m, String sfp, String std, int cr, int rr, String[] l,String ... t){
        super(n,i,m,sfp,std);
        this.codingClubRank = cr;
        this.roboClubRank = rr;
        this.languages = l;
        this.robotTypes = t;
    }
    public int memberRank(){
        return this.codingClubRank;
    }
    public int memberRankR(){
        return this.roboClubRank;
    }
    public String[] languages(){
        return this.languages;
    }
    public String[] robotTypes(){
        return this.robotTypes;
    }
    public void printDetails(){
        String stipendDetails = "";
        if(super.stipend==0)
            stipendDetails = "recieves no scholarship";
        else
            stipendDetails = "recives a scholarship of "+super.stipend+" per month.";
        System.out.println(super.name + " is a FD student with major in "+ this.major + "\n"
                           +"The id of the student is "+super.ID+" and email is "+super.email+"\n"
                           +"The student got "+this.schoolFinalPercentage+"/% marks in 12th and "
                           +stipendDetails+".\nAlso the student is a member of the "+printClubName() + " and " + printRClubName() + "with rank" + this.memberRank() + " and " + this.memberRankR() + " respectively " 
                           +" with known "+Global.printList("programming language", this.languages)
                           +" having a rank of "+this.memberRank()+ Global.printList(". He has worked on various robots", this.robotTypes) +"\n");
    }
}
