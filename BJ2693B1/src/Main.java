import java.io.*;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        ArrayList<Integer> list3rd = new ArrayList<Integer>();
        for(int i = 0; i < size; i++){
            String str = br.readLine();
            list3rd.add(search3rd(str));
        }
        for(int i = 0; i < size; i++) {
            System.out.println(list3rd.get(i));
        }
    }
    private static int search3rd(String oneline){
        StringTokenizer st = new StringTokenizer(oneline);
        ArrayList<Integer> templist = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            templist.add(Integer.parseInt(st.nextToken()));
        }
        templist.sort(Comparator.reverseOrder());
        int num3rd = templist.get(2);
        return num3rd;
    }

    // 아래는 퀵정렬 알고리즘 연습용
    public static void quicksort(int[] array, int low, int high){
        if(low<high){
            int partitionindex = partition(array, low, high);

            quicksort(array, low, partitionindex-1);
            quicksort(array, partitionindex+1, high);
        }
    }

    private static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int index = low - 1;
        for (int i = low; i < high; i++) {
            if (array[i] < pivot) {
                index++;
                swap(array, i, index);
            }
        }
        swap(array, high, index+1);
        return index+1;
    }

    private static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}