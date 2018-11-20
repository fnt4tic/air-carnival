package org.nmu.sau.lab.five;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MatrixWriteReadTest {
    Matrix matrixBean = new Matrix();
    MatrixWriteRead matrixWriteRead = new MatrixWriteRead();

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
        matrixBean.setAuthor("MatrixWriteRead Test");
    }

    @Test
    public void writeMatrixToFile() {
        matrixWriteRead.writeMatrixToFile("/Java/labs/src/main/resources/testoftest.txt", matrixBean);
        Matrix matrixBean2 = matrixWriteRead.readMatrixFromFile("/testoftest.txt");
        assertEquals(matrixBean, matrixBean2);
    }
}