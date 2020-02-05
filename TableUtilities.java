 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String ans = "";
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(j*i<10){ans+=" ";}
                ans += " "+j*i+" |";
            }
            ans += "\n" ;
        }
        return ans;
    }

    public static String getLargeMultiplicationTable() {
        String ans = "";
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                if(j*i<10){ans+="  ";}
                else if(j*i<100){ans+=" ";}
                ans += ""+j*i+" |";
            }
            ans += "\n" ;
        }
        return ans;
    }

    public static String getMultiplicationTable(int tableSize) {
        String ans = "";
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                if(j*i<10){ans+="  ";}
                else if(j*i<100){ans+=" ";}
                ans += ""+j*i+" |";
            }
            ans += "\n" ;
        }
        return ans;
    }
}
