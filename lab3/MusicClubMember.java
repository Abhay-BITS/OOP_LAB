package lab3;

public interface MusicClubMember {
    default String printMClubName(){
        return "The music club called Pantera";
    }
    public int memberRankM();
    public String[] instruments();
}
