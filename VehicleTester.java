public class VehicleTester {
    public static void main(String[] args) {
        // Membuat objek Balok
        Balok balok = new Balok();

        // Mengatur nilai panjang, lebar, dan tinggi Balok
        balok.setPanjang(Integer.parseInt("5"));
        balok.setLebar(Integer.parseInt("3"));
        balok.setTinggi(Integer.parseInt("4"));

        // Mengambil nilai panjang, lebar, dan tinggi Balok
        int panjang = balok.getPanjang();
        int lebar = balok.getLebar();
        int tinggi = balok.getTinggi();

        // Menghitung dan mencetak volume Balok
        int volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok: " + volume);
    }
}