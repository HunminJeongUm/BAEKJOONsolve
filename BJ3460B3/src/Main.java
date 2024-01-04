import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        ArrayList<Integer> divisor = new ArrayList<Integer>();
        int number = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                divisor.add(i);
            }
        }
        if (k <= divisor.size()){
            System.out.println(divisor.get(k-1));
        }
        else System.out.println(0);
    }
}