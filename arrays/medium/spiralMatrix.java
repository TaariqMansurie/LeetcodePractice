package arrays.medium;

import java.util.*;

class Solution {
    // public List<Integer> spiralOrder(int[][] matrix) {
        
    // }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>(); // Initialize a list to store the elements in spiral order.

        // Step 1: Define boundaries
        int startRow = 0; // Top row
        int startCol = 0; // Left column
        int endRow = matrix.length - 1; // Bottom row
        int endCol = matrix[0].length - 1; // Right column

        // Step 2: Traverse the matrix layer by layer
        while (startRow <= endRow && startCol <= endCol) {

            // Traverse the top row from left to right
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }
            startRow++; // Move the top boundary down

            // Traverse the right column from top to bottom
            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--; // Move the right boundary left

            // Traverse the bottom row from right to left, if rows remain
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    result.add(matrix[endRow][j]);
                }
                endRow--; // Move the bottom boundary up
            }

            // Traverse the left column from bottom to top, if columns remain
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
                startCol++; // Move the left boundary right
            }
        }

        return result; // Return the spiral order as a list
    }

    public static void main(String[] args) {
        // Test case: 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> spiral = spiralOrder(matrix); // Call the function
        System.out.println(spiral); // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}