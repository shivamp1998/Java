package Java;

public class mat {
    int[][] matrix;

    mat(int[][] mat) {
        matrix = mat;
    }

    public static mat add(mat a, mat b) {
        if(a.matrix.length == 0) return null;
        int [][] c = new int[a.matrix.length][b.matrix.length];
        for(int i=0; i<a.matrix.length; i++) {
            for(int j=0; j<a.matrix[0].length; j++) {
                c[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
        }
        return new mat(c);
    }

    public static mat multiply(mat a, mat b) {
        if(a.matrix[0].length != b.matrix.length) return null;
        
    }

    public static mat transpose(mat m) {

    }

    public static mat rotate(mat m) {

    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}