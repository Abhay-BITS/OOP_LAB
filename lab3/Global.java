package lab3;

public class Global {
    public static String[] getCGPAs(String q){
        return q.split(",");
    }

    public static String printList(String primer, String[] a){
        String r = "";
        int n = a.length;
        r = "list of "+primer+"s comprising of ";
        for(int i=0;i<(n-1);i++){
            r += a[i]+", ";
        }
        if(n==1){
          r += "only";
        }
        else{
          r += "and "+a[n-1];
        }
        return r;
    }
    public static double parseFirstDouble(String raw) {
      if (raw == null) {
          return 0.0;
      }
      if (raw.contains(",")) {
          raw = raw.split(",", 2)[0].trim();
      }
      try {
          return Double.parseDouble(raw);
      } catch (NumberFormatException e) {
          return 0.0;
        }  
    }
}
