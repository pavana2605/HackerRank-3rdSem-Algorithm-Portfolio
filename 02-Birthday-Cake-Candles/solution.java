import java.io.*;
import java.util.*;

public class Solution {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = 0;
        int count = 0;

        for (int height : candles) {
            if (height > max) {
                max = height;
                count = 1;
            } else if (height == max) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] candlesItems = bufferedReader.readLine().trim().split(" ");

        List<Integer> candles = new ArrayList<>();

        for (String item : candlesItems) {
            candles.add(Integer.parseInt(item));
        }

        int result = birthdayCakeCandles(candles);

        System.out.println(result);

        bufferedReader.close();
    }
}
