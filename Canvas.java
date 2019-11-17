package com.javarush.task.task24.task2413;

public class Canvas {
    private int width, height;
    private char[][] matrix;

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int heigth) {
        this.height = heigth;
    }

    public Canvas(int width, int heigth) {
        this.width = width;
        this.height = heigth;
        matrix = new char[heigth + 2][width + 2];
    }

    public void setPoint(double x, double y, char c) {
        int intx =(int) Math.round(x);
        int inty=(int) Math.round(y);
        if (intx > 0 && inty > 0 && inty < matrix.length && intx < matrix[0].length)
            matrix[inty][intx] = c;
    }

    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        int intx =(int) Math.round(x);
        int inty=(int) Math.round(y);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==1){
                    setPoint(x+j,y+i,c);
                }
            }
        }
    }

    public void clear(){
        setMatrix(new char[height+2][width+2]);
    }

    public void print(){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }

}


