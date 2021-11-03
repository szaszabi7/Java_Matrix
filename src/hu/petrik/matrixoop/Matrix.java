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

    public int getSorokSzama() {
        return sorokSzama;
    }

    public int getOszlopokSzama() {
        return oszlopokSzama;
    }

    public boolean isNegyzetes() {
        return this.sorokSzama == this.oszlopokSzama;
    }

    public long osszeg() {
        long sum = 0;

        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                sum += this.matrix[i][j];
            }
        }

        return sum;
    }

    public int parosDb() {
        int db = 0;

        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                if (this.matrix[i][j] % 2 == 0) db++;
            }
        }

        return db;
    }

    public int max() {
        int max = this.matrix[0][0];

        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                if (this.matrix[i][j] > max) {
                    max = this.matrix[i][j];
                }
            }
        }

        return max;
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
