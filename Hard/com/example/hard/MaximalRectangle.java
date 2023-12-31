package com.example.hard;

import java.util.Scanner;

/**
 *
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
 *
 * Example:
 *
 * Input:
 *
 *   ["1","0","1","0","0"],
 *   ["1","0","1","1","1"],
 *   ["1","1","1","1","1"],
 *   ["1","0","0","1","0"]
 *
 * Output: 6
 *
 */
class MaximalRectangle {

    public static int getMax(int[] arr) {

        int count = 0;
        int lowest = 999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest && arr[i] != 0) {
                lowest = arr[i];
            }
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
            }
        }
        return count * lowest;
    }

    public static int MaximalRectangle(String[] strArr) {
        // code goes here
        int xSize = strArr.length;
        int ySize = strArr[0].length();

        int maxArea = 0;

        int[][] numArr = new int[xSize][ySize];
        int[] rowHistogram = new int[xSize];
        int[] colHistogram = new int[ySize];

        for (int i = 0; i < strArr.length; i++) {
            String[] a = strArr[i].split("");
            for (int k = 0; k < a.length; k++) {
                numArr[i][k] = Integer.parseInt(a[k]);
            }
        }

        for (int i = 0; i < numArr.length; i++) {
            for (int k = 0; k < numArr[i].length; k++) {
                if (numArr[i][k] > 0) {
                    rowHistogram[k] += numArr[i][k];
                } else {
                    rowHistogram[k] = 0;
                }

                if (numArr[k][i] > 0) {
                    colHistogram[k] += numArr[k][i];
                } else {
                    colHistogram[k] = 0;
                }
            }
        }

        if (getMax(rowHistogram) > getMax(colHistogram)) {
            maxArea = getMax(rowHistogram);
        } else {
            maxArea = getMax(colHistogram);
        }

        return maxArea;
    }

    /**
     *
     * 10100,10111,11111,10010
     *
     * ["1","0","1","0","0"],
     *  *   ["1","0","1","1","1"],
     *  *   ["1","1","1","1","1"],
     *  *   ["1","0","0","1","0"]
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(MaximalRectangle(s.nextLine().split(",")));
    }

}
