import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static ArrayList<Integer> numlist = new ArrayList<Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] array = new int[n][m];
        for(int i = 0; i < n; i++){
            String temp = br.readLine();
            for(int j = 0; j < m; j++){
                array[i][j] = Integer.parseInt(String.valueOf(temp.charAt(j)));
            }
        }

        for(int i = 0; i < n; i++){
            //System.out.println();
            for(int j = 0; j < m; j++){
                //System.out.print(" "+array[i][j]);
            }
        }
        String shouldchecknum = null;
        String onenumcheck = null;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                onenumcheck = "" + array[i][j];
                checkpsn(onenumcheck);
            }
        }
        for(int n1 = 0; n1 < n; n1++){
            for(int m1 = 0; m1 < m; m1++){
                for(int n2 = 0; n2 < n; n2++){
                    for(int m2 = 0; m2 < m; m2++){
                        if(n1==n2 && m1 == m2) {continue;}
                        int nplus = n2-n1;
                        int nk = n2 + nplus;
                        int mplus = m2-m1;
                        int mk = m2 + mplus;
                        shouldchecknum = "" + array[n1][m1] + array[n2][m2];
                        //System.out.println("1번 : "+ shouldchecknum);
                        checkpsn(shouldchecknum);
                        while(0 <= mk && mk <m && 0<=nk && nk <n){
                            shouldchecknum += "" + array[nk][mk];
                            //System.out.println("2번 : " + n1 + " " + m1 + " " + shouldchecknum);
                            checkpsn(shouldchecknum);
                            mk += mplus;
                            nk += nplus;
                        }
                    }
                }
            }

        }
        // System.out.println(shouldchecknum);
        numlist.sort(Comparator.reverseOrder());
        if (numlist.size() != 0) {
            System.out.println(numlist.get(0));
        }
        else {
            System.out.println(-1);
        }
        for(int i = 0; i < numlist.size(); i++){
         //   System.out.println(numlist.get(i));
        }
        //System.out.println(Math.sqrt(94864));
    }
    private static void checkpsn(String num){
        int temp = Integer.parseInt(num);
        //System.out.println(temp);
        //System.out.println(Math.sqrt(temp));
        //System.out.println(Math.sqrt(temp)*Math.sqrt(temp));
        if(Math.sqrt(temp) % 1 == 0){
            //System.out.println(Math.sqrt(temp));
            numlist.add((int)temp);
        }
    }
}
