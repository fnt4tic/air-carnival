package org.nmu.sau.lab.one;

public class Main {
    public static void main( String[] args )
    {
        int matrixSize = 4;
        int randomNumberRange = 10;
        int total = 0;
        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i <matrixSize; i++) {
            for (int j = 0; j <matrixSize; j++) {
                matrix[i][j]= (int) (Math.random() * randomNumberRange);
                total+= matrix[i][j];
                System.out.print(matrix[i][j] + " "); }
            System.out.println(); }

        int minElement = matrix[0][0];
        int maxElement = matrix[0][0];

        for (int i = 0; i <matrixSize; i++) {
            for (int j = 0; j <matrixSize; j++) {
                if (matrix[i][j]< minElement){minElement = matrix[i][j]; }
                if (matrix[i][j]> maxElement) {maxElement = matrix[i][j]; } } }

        System.out.println();
        System.out.println("Сумма элементов: " + total);
        System.out.println("Минимальный элемент: " + minElement);
        System.out.println("Максимальный элемент: " + maxElement);

    }
}
