import java.util.*;
import java.io.*;

public class Main {
    private static int gcd(int a, int b) {
        int bignum = Math.max(a, b);
        int lownum = Math.min(a, b);
        int remain = bignum % lownum;

        while (remain != 0) {
            bignum = lownum;
            lownum = remain;
            remain = bignum % lownum;
        }
        return lownum;
    }

    private static int lcm(int a, int b, int gcd) {
        return (a / gcd) * (b / gcd) * gcd;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int numgcd = gcd(num1, num2);
        System.out.println(numgcd);
        int numlcm = lcm(num1, num2, numgcd);
        System.out.println(numlcm);

    }
}