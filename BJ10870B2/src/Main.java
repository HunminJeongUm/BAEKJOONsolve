import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int num0 = 0;
        int num1 = 1;
        if (number == 0) System.out.println(num0);
        else if (number == 1) System.out.println(num1);
        else{
            int total = pivonachi(num0, num1, number);
            System.out.println(total);
        }
    }
    private static int pivonachi(int f1, int f2, int n){
        if(n>2) return pivonachi(f2,f1+f2, n-1);
        else return f1+f2;
    }
}