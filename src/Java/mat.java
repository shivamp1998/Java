package Java;
public class mat {
    int [][] matrix;
    mat(int [][] mat) {
        this.matrix = mat;
    }
    public static mat add(mat a,mat b)
    {
            int [][] temp = new int [a.matrix.length][a.matrix.length];
            for(int i=0; i<a.matrix.length; i++) {
                for(int j=0; j<a.matrix.length; j++) {
                    temp[i][j] = a.matrix[i][j] + b.matrix[i][j];
                }
            }
            mat ob = new mat(temp);
            return ob;
    }
}
