import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int i = 0;
        if (a == 1)
            i = 1;
        while (a>1){
            a = a - 6 * i;
            i++;
        }
        System.out.println(""+i);
    }
}