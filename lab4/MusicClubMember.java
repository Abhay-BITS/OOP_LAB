public interface MusicClubMember {
    default String printMClubName(){
        return "The coding club called Crux";
    }
    public int memberRank();
    public String[] languages();
}