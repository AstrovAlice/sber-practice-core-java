package week4;
public class Matrix {
    int nString, nColumn;
    double [][]t;
    public void setValue(int i, int j, double value) {
        t[i][j] = value;
    }
    public Matrix(double[][]t, int nString, int nColumn) {
        this.t = t;
        this.nString = nString;
        this.nColumn = nColumn;
    }
    public void addition(Matrix b) {
        for (int i = 0; i < nString; i++) {
            double s;
            for (int j = 0; j < b.nColumn; j++) {
                s = b.t[i][j] + t[i][j];
                t[i][j] = s;
            }

        }
    }
    public void multiplication(Matrix b) {
        double s;
        double[][] c = new double[nString][b.nColumn];
        for (int i = 0; i < nString; i++) {
            for (int j = 0; j < b.nColumn; j++) {
                s = 0;
                for (int k = 0; k < b.nColumn; k++) {
                    s = s + t[i][k] * b.t[k][j];
                }
                c[i][j] = s;
            }
        }
        t = c;
    }
    public void outWrite() {
        for (int i = 0; i < nString; i++) {
            for (int j = 0; j < nColumn; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void multiplicationCoef(double k) {
        for (int i = 0; i < nString; i++) {
            for (int j = 0; j < nColumn; j++) {
                t[i][j] = k * t[i][j];
            }
        }
    }
    public static void main(String[] args) {

    }
}