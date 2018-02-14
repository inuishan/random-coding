package com.ishan.graph;

import java.util.Scanner;

/**
 * {@see <a link="https://practice.geeksforgeeks.org/problems/x-total-shapes/0"> X total shapes</a>}
 *
 * @author ishanjain
 * @since 22/01/18
 */
public class GFG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            String[] dimension = scanner.next().split(" ");
            int rows = Integer.parseInt(dimension[0]);
            int cols = Integer.parseInt(dimension[1]);
            String input = scanner.next();
            System.out.println(solveFor(rows, cols, input));
        }
    }

    private static int solveFor(int rows, int cols, String input) {
        return 0;
    }
}