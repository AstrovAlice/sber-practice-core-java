package OOP;

public class Matrix {
    private double[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new double[rows][cols];
    }

    public void setValue(int i, int j, double value) {
        matrix[i][j] = value;
    }

    public void add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Матрица должна иметь одинаковый рнг для сложения.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.matrix[i][j] += other.matrix[i][j];
            }
        }
    }

    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.matrix[i][j] *= scalar;
            }
        }
    }

    public void multiply(Matrix other) {
        if (this.cols != other.rows) {
            System.out.println("Количество столбцов в первой матрице должно быть равно количеству строк во второй матрице для умножения.");
            return;
        }

        double[][] result = new double[this.rows][other.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }

        this.matrix = result;
        this.cols = other.cols;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setValue(0, 0, 1);
        matrix1.setValue(0, 1, 2);
        matrix1.setValue(1, 0, 3);
        matrix1.setValue(1, 1, 4);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setValue(0, 0, 5);
        matrix2.setValue(0, 1, 6);
        matrix2.setValue(1, 0, 7);
        matrix2.setValue(1, 1, 8);

        System.out.println("Matrix 1:");
        matrix1.printMatrix();

        System.out.println("Matrix 2:");
        matrix2.printMatrix();

        System.out.println("Adding two matrices:");
        matrix1.add(matrix2);
        matrix1.printMatrix();

        System.out.println("Multiplying matrix by scalar 2:");
        matrix1.multiplyByScalar(2);
        matrix1.printMatrix();

        Matrix matrix3 = new Matrix(2, 3);
        matrix3.setValue(0, 0, 1);
        matrix3.setValue(0, 1, 2);
        matrix3.setValue(0, 2, 3);
        matrix3.setValue(1, 0, 4);
        matrix3.setValue(1, 1, 5);
        matrix3.setValue(1, 2, 6);

        System.out.println("Matrix 3:");
        matrix3.printMatrix();

        System.out.println("Multiplying two matrices:");
        matrix1.multiply(matrix3);
        matrix1.printMatrix();
    }
}
