import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> orderednum = new ArrayList<Integer>();
        Boolean check = true;
        for (int i = 0; i < 1000000; i++){
            String temp = "" + i;
            int firstnum = temp.length() - 2;
            for (int j = temp.length() -1 ; j >= 0 ; j--){
                if(j >= 0) {
                    int k1 = Integer.parseInt(String.valueOf(temp.charAt(firstnum)));
                    int k2 = Integer.parseInt(String.valueOf(temp.charAt(j)));
                    if (k1 > k2) {
                        firstnum = j;
                        continue;
                    }
                    check = false;
                }
            }
            if(check) {orderednum.add(i);}

        }
    }
}