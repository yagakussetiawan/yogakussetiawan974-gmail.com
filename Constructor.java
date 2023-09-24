public class Constructor {
    public static int Panjang;
    public static int Lebar;
    public static int Tinggi;

    public Constructor(int a, int b, int c) {
        Panjang = a;
        Lebar = b;
        Tinggi = c;
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(5, 3, 4);
        System.out.println("Panjang: " + Panjang);
        System.out.println("Lebar: " + Lebar);
        System.out.println("Tinggi: " + Tinggi);


        int hasilPerkalian = Panjang * Lebar * Tinggi;
        System.out.println("Volume Balok: " + hasilPerkalian);

    }
}
 