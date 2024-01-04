import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            int number = Integer.parseInt(br.readLine());
            ArrayList<Integer> binary = new ArrayList<Integer>();
            while (number > 0) {
                binary.add(number % 2);
                number = number / 2;
            }
            for (int j = 0; j < binary.size(); j++) {
                if (binary.get(j) == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
