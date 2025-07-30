import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] intArr = new int[size];
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int count = 0;
        for (int i = 0; i < size; i++){
            intArr[i] = Integer.parseInt(st.nextToken());
            if (isPrime(intArr[i]))
                count++;
        }
        System.out.println(""+count);
    }
    private static boolean isPrime(int a){
        if (a == 1)
            return false;
        else{
            for (int i = 2; i < a; i++){
                if (a % i == 0)
                    return false;
            }
            return true;
        }
    }
}