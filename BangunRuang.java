public class BangunRuang ;{
    public static int Panjang;
    public static int Lebar;
    public static int Tinggi; // kalo di public bisa di akses di index sebelah jika private tidak bisa muncul
}
    public BangunRuang(){

    }
    public static void setPanjang(int p){
        Panjang = p;
    }
    public static void setLebar(int l){
        Lebar = l;
    }
    public static void setTinggi(int t){
        Tinggi = t;
    }
    public static int getPanjang() {
        return Panjang;
    }
    public static int getLebar() {
        return Lebar;
    }
    public static int getTinggi() {
        return Tinggi;
        

}