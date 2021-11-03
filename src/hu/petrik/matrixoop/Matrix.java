package hu.petrik.matrixoop;

public class Matrix {
    private int sorokSzama;
    private int oszlopokSzama;
    private int[][] matrix;

    public Matrix(int sorokSzama, int oszlopokSzama, int[][] matrix) {
        this.sorokSzama = sorokSzama;
        this.oszlopokSzama = oszlopokSzama;
        this.matrix = matrix;
    }

    public Matrix() {
        this.sorokSzama = (int)(Math.random()*10)+1;
        this.oszlopokSzama = (int)(Math.random()*10)+1;
        this.matrix = new int[this.sorokSzama][this.oszlopokSzama];

        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                this.matrix[i][j] = (int)(Math.random()*90)+10;
            }
        }
    }

    public boolean isNegyzetes() {
        return this.sorokSzama == this.oszlopokSzama;
    }

    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                s += matrix[i][j] + " ";
            }
            s += "\n";
        }

        return s;
    }
}
