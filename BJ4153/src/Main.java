import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> checklist= new ArrayList<String>();
        while(true){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int hypo =  Integer.parseInt(st.nextToken());
            if (width == 0 && height == 0 && hypo == 0){
                break;
            }
            System.out.println(tricheck(width,height,hypo));
        }
    }

    private static String tricheck(int a, int b, int c) {
        int[] intArr = {a,b,c};
        Arrays.sort(intArr);
        if (Math.pow(intArr[0],2) + Math.pow(intArr[1],2) == Math.pow(intArr[2],2))
            return "right";
        return "wrong";
    }
}