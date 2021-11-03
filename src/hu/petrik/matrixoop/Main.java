package hu.petrik.matrixoop;

public class Main {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        System.out.println("Néhyzetes-e: " + (m.isNegyzetes()? "igen": "nem"));
        System.out.println(m);
    }
}
