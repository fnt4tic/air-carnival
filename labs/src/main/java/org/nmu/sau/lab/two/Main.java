package org.nmu.sau.lab.two;

public class Main {
    public static void main(String[] args) {
        MatrixManager matrixManager = new MatrixManager();
        Matrix matrixBean = matrixManager.createArray(2, 2);
        matrixBean.setMatrixBody(matrixBean.getMatrixBody());
        matrixManager.printArray(matrixBean);
        System.out.println("Min/max: " + matrixManager.findMin(matrixBean) + " / " + matrixManager.findMax(matrixBean));
        System.out.println("Sum: " + matrixManager.findSum(matrixBean));
    }
}
