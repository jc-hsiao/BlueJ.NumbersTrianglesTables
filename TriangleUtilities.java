 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String ans = "";
        for(int i = 0; i < numberOfStars; i++){
            ans += "*";
        }
        return ans;
    }
    
    public static String getTriangle(int numberOfRows) {
        String res = "";
        for(int i = 1; i <= numberOfRows; i++){
            for(int j = 1; j <= i; j++){
                res += "*";
            }
            res += "\n";
        }
        return res;
    }

    public static String getSmallTriangle() {
        String res = "";
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                res += "*";
            }
            res += "\n";
        }
        return res;
    }

    public static String getLargeTriangle() {
        String res = "";
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                res += "*";
            }
            res += "\n";
        }
        return res;
    }
}
