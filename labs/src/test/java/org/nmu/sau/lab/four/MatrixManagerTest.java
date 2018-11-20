package org.nmu.sau.lab.four;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MatrixManagerTest {
    Matrix matrixBean = new Matrix();
    MatrixManager matrixManager = new MatrixManager();

    @Before
    public void initMatrix() {
        List<List<Integer>> matrixBody = new ArrayList();
        int number = 1;
        for (int i = 0; i < 2; i++) {
            matrixBody.add(new ArrayList());
            for (int j = 0; j < 2; j++) {
                matrixBody.get(i).add(number);
                number++;
            }
        }
        matrixBean.setMatrixBody(matrixBody);
        matrixBean.setRows(2);
        matrixBean.setColumns(2);
    }

    @Test
    public void findMin() {
        assertEquals(1, matrixManager.findMin(matrixBean));
    }

    @Test
    public void findMax() {
        assertEquals(4, matrixManager.findMax(matrixBean));
    }

    @Test
    public void findSum() {
        assertEquals(10, matrixManager.findSum(matrixBean));
    }
}