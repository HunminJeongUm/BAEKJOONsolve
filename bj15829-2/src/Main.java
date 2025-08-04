import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        str = br.readLine();
        char[] charArray = str.toCharArray();
        long sum = 0;
        long r= 1;

        for (int i = 0; i < N; i++) {
            sum += (charArray[i] - 96) * r;
            sum %= 1234567891;
            r *= 31;
            r %= 1234567891;
        }
        System.out.println(sum);
    }
}