import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSort1(int n, List<Integer> arr) {
        int value = arr.get(n - 1);
        int i = n - 2;

        while (i >= 0 && arr.get(i) > value) {
            arr.set(i + 1, arr.get(i));
            printArray(arr);
            i--;
        }

        arr.set(i + 1, value);
        printArray(arr);
    }

    public static void printArray(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i < arr.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().trim().split(" ");

        List<Integer> arr = new ArrayList<>();

        for (String item : arrItems) {
            arr.add(Integer.parseInt(item));
        }

        insertionSort1(n, arr);

        bufferedReader.close();
    }
}
