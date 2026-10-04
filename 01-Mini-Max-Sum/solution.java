import java.io.*;
import java.util.*;

public class Solution {

    public static void miniMaxSum(List<Integer> arr) {
        long total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            total += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String[] arrItems = bufferedReader.readLine().trim().split(" ");

        List<Integer> arr = new ArrayList<>();

        for (String item : arrItems) {
            arr.add(Integer.parseInt(item));
        }

        miniMaxSum(arr);

        bufferedReader.close();
    }
}
