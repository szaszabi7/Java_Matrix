package hu.petrik.matrixoop;

public class Main {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        System.out.println("Néhyzetes-e: " + (m.isNegyzetes()? "igen": "nem"));
        System.out.println(m);
        System.out.println("Mátrix mérete: " + m.getSorokSzama() + "x" + m.getOszlopokSzama());
        System.out.println("Mátrix elemeinek összege: " + m.osszeg());
        System.out.println("Mátrix páros elemeinek száma: " + m.parosDb());
        System.out.println("Mátrix legnagyobb eleme: " + m.max());
    }
}
