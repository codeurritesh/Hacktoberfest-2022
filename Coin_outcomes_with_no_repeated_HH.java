import java.util.Scanner;

public class Coin_outcomes_with_no_repeated_HH {
public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            outcomes(n,"");
        }
        public static void outcomes(int n,String ans){
            if(n==0)
            {
                System.out.println(ans);
                return;
            }
            if( ans.length()==0 || ans.charAt(ans.length()-1)=='H') {
                outcomes(n - 1, ans + "T");
            }
//            outcomes(n-1,ans+"H");
            outcomes(n-1,ans+"H");
        }}
