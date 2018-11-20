package org.nmu.sau.lab.two;

public class MatrixManager {
    public Matrix createArray(int rows, int columns) {
        Matrix matrixBean = new Matrix();
        int[][] tempMatrix = new int[rows][columns];
        int randomNumberRange = 10;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tempMatrix[i][j] = (int) (Math.random() * randomNumberRange);
            }
        }
        matrixBean.setRows(rows);
        matrixBean.setColumns(columns);
        matrixBean.setMatrixBody(tempMatrix);
        return matrixBean;
    }

    public void printArray(Matrix matrixBean) {
        int[][] tempMatrix = matrixBean.getMatrixBody();
        for (int i = 0; i < matrixBean.getRows(); i++) {
            for (int j = 0; j < matrixBean.getColumns(); j++) {
                System.out.print(tempMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int findMin(Matrix matrixBean) {
        int[][] tempMatrix = matrixBean.getMatrixBody();
        int minElement = tempMatrix[0][0];
        for (int i = 0; i < matrixBean.getRows(); i++) {
            for (int j = 0; j < matrixBean.getColumns(); j++) {
                if (tempMatrix[i][j] < minElement) {
                    minElement = tempMatrix[i][j];
                }
            }
        }
        return minElement;
    }

    public int findMax(Matrix matrixBean) {
        int[][] tempMatrix = matrixBean.getMatrixBody();
        int maxElement = tempMatrix[0][0];
        for (int i = 0; i < matrixBean.getRows(); i++) {
            for (int j = 0; j < matrixBean.getColumns(); j++) {
                if (tempMatrix[i][j] > maxElement) {
                    maxElement = tempMatrix[i][j];
                }
            }
        }
        return maxElement;
    }

    public int findSum(Matrix matrixBean) {
        int[][] tempMatrix = matrixBean.getMatrixBody();
        int totalSum = 0;
        for (int i = 0; i < matrixBean.getRows(); i++) {
            for (int j = 0; j < matrixBean.getColumns(); j++) {
                totalSum += tempMatrix[i][j];
            }
        }
        return totalSum;
    }
}
