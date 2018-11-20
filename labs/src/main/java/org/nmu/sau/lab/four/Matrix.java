package org.nmu.sau.lab.four;

import java.util.List;

public class Matrix {
    private List<List<Integer>> matrixBody;
    private int columns;
    private int rows;

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public List<List<Integer>> getMatrixBody() {
        return matrixBody;
    }

    public void setMatrixBody(List<List<Integer>> matrixBody) {
        this.matrixBody = matrixBody;
    }
}
