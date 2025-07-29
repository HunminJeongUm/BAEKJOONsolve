import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrProto = new int[9];
        for(int i = 0; i < 9; i++){
            arrProto[i] = Integer.parseInt(br.readLine());
        }
        int[] arrCalcul = Arrays.copyOfRange(arrProto,0,7);

        if(num100check(arrCalcul)){
            printarr(arrCalcul);
        }
        else{
            int[] arrfinal = arrfinal(arrProto,arrCalcul);
            printarr(arrfinal);
        }
        // Arrays.stream(arrCalcul).sum();
    }
    private static boolean num100check (int[] arr){
        return Arrays.stream(arr).sum() == 100;
    }
    private static int[] arrfinal(int[] proto,int[] calcul){
        for(int i = 0; i < 7; i++){
            int tempi = calcul[i];
            calcul[i] = proto[7];
            if(num100check(calcul)) return calcul;
            for(int j = 0; j < 7; j++){
                int tempj = calcul[j];
                calcul[j] = proto[8];
                if(num100check(calcul)) return calcul;
                calcul[j] = tempj;
            }
            calcul[i] = tempi;
        }
        return null;
    }
    private static void printarr(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < 7; i++){
            System.out.println(arr[i]);
        }
    }


}