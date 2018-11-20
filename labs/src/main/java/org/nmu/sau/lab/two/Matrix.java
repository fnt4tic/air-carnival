package org.nmu.sau.lab.two;

public class Matrix {
    private int[][] matrixBody;
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

    public int[][] getMatrixBody() {
        return matrixBody;
    }

    public void setMatrixBody(int[][] matrixBody) {
        this.matrixBody = matrixBody;
    }
}
