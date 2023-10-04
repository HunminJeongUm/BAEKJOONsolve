import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        ArrayList<Integer> countlist= new ArrayList<Integer>();
        for(int i = 0; i < size; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int start = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken())- start;
            countlist.add(func(distance));
        }
        for(int i = 0; i < countlist.size(); i++){
            System.out.println(countlist.get(i));
        }
    }
    private static int func(int distance){
        int exup = (int)Math.ceil(Math.sqrt(distance));
        int exdown = (int)Math.floor(Math.sqrt(distance));
        if(exdown==exup) exdown--;
        double d = Math.pow(exup, 2) - Math.pow(exdown, 2);
        if(Math.pow(exup,2) - d/2 > distance) return 2*exup-2;
        else return 2*exup-1;
    }
}