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
    
    public static Double getSchoolPercentage (String q) {
      String[] arr = q.split(",");
      if (arr[0].equals(null)) {
        return Double.parseDouble(q);
      }
      return Double.parseDouble(arr[0]);
    }
}
