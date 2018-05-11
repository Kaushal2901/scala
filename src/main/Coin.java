package main;

import java.lang.reflect.Array;
import java.util.*;

public class Coin {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int values[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
            sum = sum + values[i];
        }

        System.out.println(sum);
        int j = 1, smallest = 0;

        while (j <= sum) {
            if (j < values[0]) {
                smallest = j;
                break;
            } else {
                if (subArraySum(values, values.length, j) == false) {
                    smallest = j;
                    break;
                } else {
                }
            }
            j++;
        }
        if (smallest == 0) {
            System.out.println(sum + 1);
        } else {
            System.out.println(smallest);
        }
    }


    public static boolean subArraySum(int arr[], int n, int sum) {
        int curr_sum = arr[0], start = 0, i;

        for (i = 1; i <= n; i++) {

            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            if (curr_sum == sum) {
                int p = i - 1;
                return true;
            }


            if (i < n)
                curr_sum = curr_sum + arr[i];

        }

        return false;
    }


}
