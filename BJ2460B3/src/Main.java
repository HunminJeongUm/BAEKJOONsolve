import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int passenger_num = 0;
        int maxnum = 0;
        for (int i = 0; i < 10; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            passenger_num -= Integer.parseInt(st.nextToken());
            passenger_num += Integer.parseInt(st.nextToken());
            if (maxnum < passenger_num) maxnum = passenger_num;
        }
        System.out.println(maxnum);

    }
}