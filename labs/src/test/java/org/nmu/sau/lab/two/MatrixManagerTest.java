package org.nmu.sau.lab.two;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class MatrixManagerTest {
    private static final int MATRIX_TEST[][] = {{1, 2}, {3, 4}};
    Matrix matrixBean = new Matrix();
    MatrixManager matrixManager = new MatrixManager();

    @Before
    public void initMatrix() {
        matrixBean.setMatrixBody(MATRIX_TEST);
        matrixBean.setRows(2);
        matrixBean.setColumns(2);
    }

    @org.junit.Test
    public void findMin() {
        assertEquals(1, matrixManager.findMin(matrixBean));
    }

    @org.junit.Test
    public void findMax() {
        assertEquals(4, matrixManager.findMax(matrixBean));
    }

    @org.junit.Test
    public void findSum() {
        assertEquals(10, matrixManager.findSum(matrixBean));
    }
}