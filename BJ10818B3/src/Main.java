import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        ArrayList<Integer> numberlist = new ArrayList<Integer>();
        String str = br.readLine();
        String[] strarr = str.split(" ");

        for (int i = 0; i < size; i++) {
            int temp = Integer.parseInt(strarr[i]);
            numberlist.add(temp);
        }
        numberlist.sort(Comparator.naturalOrder());
        int minnum = numberlist.get(0);
        int maxnum = numberlist.get(size-1);
        System.out.print(minnum + " " + maxnum);
    }
}
