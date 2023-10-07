import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] tfcheck = new String[size];
        for(int i = 0; i < size; i++) {
            String str = br.readLine();
            int n = 0;
            int[] number = new int[str.length()];
            for(int j = 0; j < str.length(); j++){
                number[j] = Character.getNumericValue(str.charAt(j));
            }
            while(n < number.length){
                if (number[n] == 1) {
                    n++;
                    if (n < number.length && number[n] == 0) {
                        n++;
                        if (n < number.length && number[n] == 0) {
                            n++;
                            while (n < number.length && number[n] == 0) {
                                n++;
                            }
                            if (n == number.length) {
                                tfcheck[i] = "NO";
                                break;
                            }
                            int count = 0;
                             while(n < number.length && number[n] == 1) {
                                n++;
                                count++;
                            }
                             if(count > 1 && n < number.length-1 && number[n] == 0 && number[n+1] == 0){
                                 n--;
                             }
                        }
                        else {
                            tfcheck[i] = "NO";
                            break;
                        }
                    }
                    else {
                        tfcheck[i] = "NO";
                        break;
                    }
                }
                else{ // number[n] == 0
                    n++;
                    if (n < number.length && number[n] == 1){
                        n++;
                    }
                    else {
                        tfcheck[i] = "NO";
                        break;
                    }
                }
                if (n == number.length)  tfcheck[i] = "YES";
            }
        }
        for(int i = 0; i < tfcheck.length; i++){
            System.out.println(tfcheck[i]);
        }
    }


}