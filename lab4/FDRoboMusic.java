public class FDRoboMusic extends FDStudent implements CodingClubMember, RoboticsClubMember{
    private int musicClubRank;
    private int roboClubRank;
    private String[] robotTypes;
    private String[] instruments;
    public FDRoboMusic(String n, String i, String m, String sfp, String std, int cr, int rr, String[] l,String ... t){
        super(n,i,m,sfp,std);
        this.musicClubRank = cr;
        this.roboClubRank = rr;
        this.instruments = l;
        this.robotTypes = t;
    }
    public int memberRank(){
        return this.musicClubRank;
    }
    public int memberRankR(){
        return this.roboClubRank;
    }
    public String[] languages(){
        return this.instruments;
    }
    public String[] robotTypes(){
        return this.robotTypes;
    }
    public String printClubName() {
        return "Music and Robotics";
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
                           +stipendDetails+".\nAlso the student is a member of the "+printClubName()
                           +" with known "+Global.printList("programming language", this.instruments)
                           +" having a rank of "+this.memberRank()+".\nThey are member of both Music and Robotics Clubs.");
    }
}