import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int xl = Integer.parseInt(st.nextToken());
        int xxl = Integer.parseInt(st.nextToken());
        int xxxl = Integer.parseInt(st.nextToken());
        str = br.readLine();
        st = new StringTokenizer(str);
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int T_set = setcheck(s,T) + setcheck(m,T) +setcheck(l,T) +setcheck(xl,T) +setcheck(xxl,T) +setcheck(xxxl,T);
        int P_set = people/P;
        int P_one = people%P;

        System.out.println(""+T_set);
        System.out.println(""+P_set + " " + P_one);
    }
    private static int setcheck(int a, int T){
        if (a % T != 0)
            return a/T+1;
        else // a % T == 0
            return a/T;
    }
}