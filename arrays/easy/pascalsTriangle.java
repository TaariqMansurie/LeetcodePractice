package arrays.easy;

import java.util.ArrayList;
import java.util.List;

class Solution {

    // Method to calculate the first numRows of Pascal's Triangle
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                // First and last elements of the row are always 1
                if (col == 0 || col == row) {
                    currentRow.add(1);
                } else {
                    // Other elements are the sum of two numbers above
                    int value = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                    currentRow.add(value);
                }
            }
            triangle.add(currentRow);
        }
        return triangle;
    }

    // Main method to test the Pascal's Triangle generation
    public static void main(String[] args) {
        int numRows = 5; // Example input
        List<List<Integer>> result = generate(numRows);

        System.out.println("Pascal's Triangle with " + numRows + " rows:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
