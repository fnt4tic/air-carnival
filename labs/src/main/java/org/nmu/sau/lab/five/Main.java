package org.nmu.sau.lab.five;

public class Main {
    public static void main(String[] args) {
        MatrixManager matrixManager = new MatrixManager();
        MatrixWriteRead matrixWriteRead = new MatrixWriteRead();
        Matrix matrixOne = matrixManager.createArray(2, 2, "SampleName");
        matrixWriteRead.writeMatrixToFile("/Java/labs/src/main/resources/WriteSample.txt", matrixOne);
        Matrix matrixTwo = matrixWriteRead.readMatrixFromFile("/WriteSample.txt");
        matrixManager.printArray(matrixTwo);
        System.out.println("Min/max: " + matrixManager.findMin(matrixTwo) + " / " + matrixManager.findMax(matrixTwo));
        System.out.println("Sum: " + matrixManager.findSum(matrixTwo));
        System.out.println("Author: " + matrixTwo.getAuthor());
    }
}
